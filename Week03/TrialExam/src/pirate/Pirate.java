package pirate;

public class Pirate {
  private String pirateName;
  private int amountOfGold;
  private int amountOfHealth;
  private boolean hasAwoodenLeg;
  private boolean isCaptian;

  public Pirate() {
  }

  public Pirate(String pirateName) {
    this.pirateName = pirateName;
    this.amountOfGold = 10;
    this.amountOfHealth = 10;
    this.hasAwoodenLeg = false;
    this.isCaptian = false;
  }

  public void work() {
    if (this.isCaptian = true) {
      this.amountOfGold += 10;
      this.amountOfHealth -= 5;
    } else {
      this.amountOfGold++;
      this.amountOfHealth--;
    }
  }

  public void party() {
    if (this.isCaptian = true) {
      this.amountOfHealth += 10;
    } else {
      this.amountOfHealth++;
    }
  }

  public String toString() {
    if (this.hasAwoodenLeg = true) {
      return "Hello, I'm " + this.pirateName + ".I have a wooden leg and " + this.amountOfGold +
          " golds.";
    } else {
      return "Hello, I'm " + this.pirateName + ".I still have my real legs and " +
          this.amountOfGold + "golds.";
    }
  }
}