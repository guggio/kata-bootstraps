package scorekeeper;

public class ScoreKeeper {

  private final Score scoreA;
  private final Score scoreB;

  public ScoreKeeper() {
    scoreA = new Score();
    scoreB = new Score();
  }

  public String getScore() {
    return String.format("%03d:%03d", scoreA.getValue(), scoreB.getValue());
  }

  public void scoreTeamA1() {
    scoreA.addOne();
  }

  public void scoreTeamA2() {
    scoreA.addTwo();
  }

  public void scoreTeamA3() {
    scoreA.addThree();
  }

  public void scoreTeamB1() {
    scoreB.addOne();
  }

  public void scoreTeamB2() {
    scoreB.addTwo();
  }

  public void scoreTeamB3() {
    scoreB.addThree();
  }

}
