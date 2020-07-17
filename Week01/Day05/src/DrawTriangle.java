import java.util.Scanner;
import java.io.*;


public class DrawTriangle {
  public static void main(String[] args) {


    // Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please give me a number:");
    int number = scanner.nextInt();

    for (int i = 0; i < number; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}