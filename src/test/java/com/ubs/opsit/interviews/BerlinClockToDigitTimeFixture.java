package com.ubs.opsit.interviews;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Test;

import static com.ubs.opsit.interviews.support.BehaviouralTestEmbedder.aBehaviouralTestRunner;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Acceptance test class that uses the JBehave (Gerkin) syntax for writing stories.  
 * You will notice the TimeConverter has no implementation ... (hint)
 */
public class BerlinClockToDigitTimeFixture {

    private TimeConverter berlinClock= new BerlinClockTimeConverter();
    private String theTime;
    private String theBerlinClock;

    @Test
    public void berlinClockAcceptanceTests() throws Exception {
        aBehaviouralTestRunner()
                .usingStepsFrom(this)
                .withStory("berlin-clock-to-time.story")
                .run();
    }

    @When("the Berlin clock is $theBerlinClock")
    public void whenTheTimeIs(String theBerlinClock) {
        if(theBerlinClock== null)
            this.theBerlinClock = null;
        else
            this.theBerlinClock = theBerlinClock.replaceAll("\r\n", "\n");
    }

    @Then("the time should be $")
    public void thenTheClockShouldLookLike(String expectedDigitTime) {
        assertThat(berlinClock.berlinClockToDigitTime(theBerlinClock)).isEqualTo(expectedDigitTime);

    }    
}
