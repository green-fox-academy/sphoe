package datastructure;
import java.awt.*;

public class DataStructure {
  public static void main(String[] args) {

    PostIt firstPostIt = new PostIt(Color.orange, "Idea 1", Color.BLUE);
    PostIt secondPostIt = new PostIt(Color.pink, "Awesome", Color.BLACK);
    PostIt thirdPostIt = new PostIt(Color.yellow, "Suberb", Color.green);
    System.out.println(firstPostIt.getBackroundColor());
  }
}
