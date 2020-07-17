import java.util.Scanner;

public class Pyramid {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please give me a number:");
    int number = scanner.nextInt();
    for (int i = 0; i < number; i++) {
      for (int j = number - i; j > 1; j--) {
        System.out.print(" ");
      }
      for (int j = 0; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();

    }

  }
}



