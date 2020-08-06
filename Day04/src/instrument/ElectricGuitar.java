package instrument;

public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar() {
    name = "Electric Guitar";
    numberOfStrings = 6;
  }

  public ElectricGuitar(int numberOfStrings) {
    name = "Electric guitar";
    this.numberOfStrings = numberOfStrings;

  }

  @Override
  public String sound() {
    return " Twang";
  }
}
