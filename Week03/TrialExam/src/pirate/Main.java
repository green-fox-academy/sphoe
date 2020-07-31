package pirate;

public class Main {
  public static void main(String[] args) {
    Pirate pirates = new Pirate();
    Ship ship = new Ship();
    pirates.party();
    ship.addNewPirateTotheShip();
  }
}
