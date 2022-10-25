package scorekeeper;

class Score {

  private int value;

  int getValue() {
    return value;
  }

  void addOne() {
    value++;
  }

  void addTwo() {
    value = value + 2;
  }

  void addThree() {
    value = value + 3;
  }
}
