package animal;
//Create an Animal class
// Every animal has a hunger value, which is a whole number
// Every animal has a thirst value, which is a whole number
// when creating a new animal object these values are created with the default 50 value
// Every animal can eat() which decreases their hunger by one
// Every animal can drink() which decreases their thirst by one
// Every animal can play() which increases both by one
public class Animal {

  private int hunger = 50;

  public void setHunger(int hunger) {
    this.hunger = hunger;
  }

  public void setThirst(int thirst) {
    this.thirst = thirst;
  }

  private int thirst = 50;

  public int getHunger() {
    return hunger;
  }

  public int getThirst() {
    return thirst;
  }

  public int eat() {
    return hunger - 1;
  }

  public int drink() {
    return thirst - 1;
  }

  public void play() {
    setHunger(hunger + 1);
    setThirst(thirst + 1);
  }
}
