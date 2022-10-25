package scorekeeper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestScoreKeeper {

  private  ScoreKeeper scoreKeeper;

  @BeforeEach
  void setUp() {
    scoreKeeper = new ScoreKeeper();
  }

  @Test
  void shouldReturnStartScore() {
    assertEquals("000:000", scoreKeeper.getScore());
  }

  @Test
  void shouldUpdateScoreWithOnePointAfterOnePointerFromA() {
    scoreKeeper.scoreTeamA1();
    assertEquals("001:000", scoreKeeper.getScore());
  }

  @Test
  void shouldUpdateScoreWithOnePointAfterOnePointerFromB() {
    scoreKeeper.scoreTeamB1();
    assertEquals("000:001", scoreKeeper.getScore());
  }

  @Test
  void shouldUpdateScoreWithOnePointAfterOnePointerFromBothTeams() {
    scoreKeeper.scoreTeamA1();
    scoreKeeper.scoreTeamB1();
    assertEquals("001:001", scoreKeeper.getScore());
  }

  @Test
  void shouldUpdateScoreWithTwoPointsAfterTWoPointerFromA() {
    scoreKeeper.scoreTeamA2();
    assertEquals("002:000", scoreKeeper.getScore());
  }

  @Test
  void shouldUpdateScoreWithTwoPointsAfterTWoPointerFromB() {
    scoreKeeper.scoreTeamB2();
    assertEquals("000:002", scoreKeeper.getScore());
  }

  @Test
  void shouldUpdateScoreWithTwoPointAfterTwoPointerFromBothTeams() {
    scoreKeeper.scoreTeamA2();
    scoreKeeper.scoreTeamB2();
    assertEquals("002:002", scoreKeeper.getScore());
  }

  @Test
  void shouldUpdateScoreWithThreePointsAfterThreePointerFromA() {
    scoreKeeper.scoreTeamA3();
    assertEquals("003:000", scoreKeeper.getScore());
  }

  @Test
  void shouldUpdateScoreWithThreePointsAfterThreePointerFromB() {
    scoreKeeper.scoreTeamB3();
    assertEquals("000:003", scoreKeeper.getScore());
  }

  @Test
  void shouldUpdateScoreWithThreePointAfterThreePointerFromBothTeams() {
    scoreKeeper.scoreTeamA3();
    scoreKeeper.scoreTeamB3();
    assertEquals("003:003", scoreKeeper.getScore());
  }

  @Test
  void shouldUpdateScoreWithDifferentScoresFromBothTeams() {
    scoreKeeper.scoreTeamA1(); // 1:0
    scoreKeeper.scoreTeamB2(); // 1:2
    scoreKeeper.scoreTeamA3(); // 4:2
    scoreKeeper.scoreTeamA2(); // 6:2
    scoreKeeper.scoreTeamB3(); // 6:5
    scoreKeeper.scoreTeamB3(); // 6:8
    scoreKeeper.scoreTeamB3(); // 6:11
    assertEquals("006:011", scoreKeeper.getScore());
  }

  @Test
  void shouldDisplayScoreInSevenCharactersWithBothTeamsScoringThreeDigitPints() {
    IntStream.rangeClosed(0, 33).forEach(i -> {
      scoreKeeper.scoreTeamA3();
      scoreKeeper.scoreTeamB3();
    });
    assertEquals("102:102", scoreKeeper.getScore());
  }
}
