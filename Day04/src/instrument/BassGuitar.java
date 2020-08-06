package instrument;

public class BassGuitar extends StringedInstrument {

  public BassGuitar() {
    name = "Bass Guitar";
    numberOfStrings = 6;
  }

  public BassGuitar(int numberOfStrings) {
    name = "Bass guitar";
    this.numberOfStrings = numberOfStrings;
  }

  @Override
  public String sound() {
    return " Duum-duum-duum";
  }
}

