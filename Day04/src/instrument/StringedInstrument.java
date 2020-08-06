package instrument;

public abstract class StringedInstrument extends Instrument {
  protected int numberOfStrings;

  public abstract String sound();

  public void play() {
    System.out.println("Type: " + name + " " + numberOfStrings + " instrument that goes " + sound());
  }
}
