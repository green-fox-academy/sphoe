import java.util.Scanner;

public class MileToKmConverter {
        public static void main(String[] args) {
            // Write a program that asks for a double that is a distance in miles,
            // then it converts that value to kilometers and prints it
            Scanner scanner = new Scanner(System.in);
            System.out.println("Give me a double number which will be a miles:");
            double inputUser = scanner.nextDouble();
            System.out.println(inputUser);
            System.out.println("Your number in kilometers: " + (String.format("%.2f",inputUser * 1.609344 )));

        }
    }

