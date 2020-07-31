package pirate;

import java.util.ArrayList;
import java.util.List;

public class Ship {
  private List<Pirate> pirates = new ArrayList();
  private int placeOftheShip = 10;
  private Pirate pirateCall = new Pirate();

  public void addNewPirateTotheShip() {
    if (placeOftheShip > 0) {
      pirates.add(new Pirate());
      placeOftheShip--;
    } else {
      System.out.println("No more place");
    }
  }

  public void lastDayOnTheShip() {
    pirateCall.party();
  }

  public void prepareForBattle() {
    for (int i = 0; i < 5; i++) {
      pirateCall.work();
      lastDayOnTheShip();
    }
  }
}