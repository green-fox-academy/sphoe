package sharpieset;

import java.util.ArrayList;

public class SharpieSet {

  private ArrayList<Sharpie> sharpie;

  public int getSharpie() {
    return sharpie.size();
  }

  public SharpieSet() {
    sharpie = new ArrayList<Sharpie>();
  }

  public void add(Sharpie sharpie) {
    this.sharpie.add(sharpie);
  }

  public int countUsable() {
    int counter = 0;
    for (Sharpie sharp : sharpie) {
      if (sharp.getInkAmount() >= 0) {
        counter++;
      }
    }
    return counter;
  }

  public void removeTrash() {
    int count = 0;
    for (Sharpie sharpi : sharpie) {
      if (sharpi.getInkAmount() == 0) {
        sharpie.remove(sharpi);
      }
    }
  }
}