# Solution for the Score Keeper Kata

[Link](https://kata-log.rocks/score-keeper-kata)

## Problem

We need software to deliver the proper data to the scoreboard for a basketball team. Unfortunately the people using our
software are not the brightest lights under the sun, so they need six buttons (each team can score either 1, 2 or 3
points with a single shot).

## Your Task

Write a class ```ScoreKeeper```  which offers following methods:

``` java
void scoreTeamA1()
void scoreTeamA2()
void scoreTeamA3()
void scoreTeamB1()
void scoreTeamB2()
void scoreTeamB3()
String getScore()
``` 

## Rules

The returned String always has seven characters. An example would be ```000:000```

## Assumptions

Although the score string should always have seven characters, I did not specifically limit the amount of points a team
can score. So if a team scores more than one thousand points, the score String will be longer than seven characters.