import java.util.Scanner;

public class AnimalsAndLegs {
  public static void main(String[] args) {
    // Write a program that asks for two integers
    // The first represents the number of chickens the farmer has
    // The second represents the number of pigs owned by the farmer
    // It should print how many legs all the animals have
    Scanner scan2 = new Scanner(System.in);
    System.out.println("Give me chicken numbers:");
    int userInput = scan2.nextInt();
    System.out.println("Give me pigs numbers:");
    int userInput2 = scan2.nextInt();
    System.out.println((userInput * 2) + (userInput2 * 4));


  }
}

