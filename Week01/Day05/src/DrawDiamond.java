import java.util.Scanner;

public class DrawDiamond {
  public static void main(String[] args) {
    // Write a program that reads a number from the standard input, then draws a
// diamond like this:
//
//
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
// The diamond should have as many lines as the number was
    Scanner scanner = new Scanner(System.in);
    System.out.println("Give me a number:");
    int number = scanner.nextInt();
    for (int i = 0; i < number; i++) {
      System.out.println("");
      for (int j = 0; j < i; j++) {
        System.out.print("* ");
      }
    }
    //for (int i = 0; i > number; i++) {
    //System.out.println("");
    //for (int j = 0; j < i; j++) {
    //  System.out.print("* ");
      }
    }
  }
}