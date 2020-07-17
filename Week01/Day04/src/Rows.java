import java.sql.SQLOutput;
import java.util.Scanner;

public class Rows {

    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,

// then it should print the sum and the average of these numbers like:
// Sum: 22, Average: 4.4
        System.out.println("Give me 5 integers:");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        int userInput1 = scanner.nextInt();
        int userInput2 = scanner.nextInt();
        int userInput3 = scanner.nextInt();
        int userInput4 = scanner.nextInt();
        int sumUserInput = userInput + userInput1 + userInput2 + userInput3 + userInput4;
        System.out.println("Sum:" + sumUserInput);
        System.out.println("Avarage: " + sumUserInput / 5);
    }
}