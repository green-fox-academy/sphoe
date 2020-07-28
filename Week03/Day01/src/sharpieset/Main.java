package sharpieset;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    //Sharpie pen = new Sharpie("green", 4.44f);
    //pen.use();
    //System.out.println(pen.getInkAmount());

    SharpieSet setOfSharpies = new SharpieSet();
    setOfSharpies.add(new Sharpie("yellow"));
    setOfSharpies.add(new Sharpie("pink"));
    setOfSharpies.add(new Sharpie("green"));
    setOfSharpies.add(new Sharpie("blue"));

    System.out.println(setOfSharpies.getSharpie());
  }
}
