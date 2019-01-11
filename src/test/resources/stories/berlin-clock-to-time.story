Story: The Berlin Clock to Digit Time

Meta:
@scope interview

Narrative:
    As a clock enthusiast
    I want to tell the time using the Berlin Clock
    So that I can increase the number of ways that I can read the time

Scenario: Midnight
When the Berlin clock is
Y
OOOO
OOOO
OOOOOOOOOOO
OOOO
Then the time should be
00:00:00

Scenario: Middle of the afternoon
When the Berlin clock is
O
RROO
RRRO
YYROOOOOOOO
YYOO
Then the time should be
13:17:01

Scenario: Just before midnight
When the Berlin clock is
O
RRRR
RRRO
YYRYYRYYRYY
YYYY
Then the time should be
23:59:59

Scenario: Midnight
When the Berlin clock is
Y
RRRR
RRRR
OOOOOOOOOOO
OOOO
Then the time should be
24:00:00

