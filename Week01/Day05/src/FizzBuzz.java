public class FizzBuzz {
  public static void main(String[] args) {
    // Write a program that prints the numbers from 1 to 100.
// But for multiples of three print “Fizz” instead of the number
// and for the multiples of five print “Buzz”.
// For numbers which are multiples of both three and five print “FizzBuzz”.
    int numbers = 0;
    for (int i = 1; i < 101; i++) {
      System.out.print(i + " ");
      if (i % 3 == 0) {
        System.out.println("fizz");
      } else if (i % 5 == 0) {
        System.out.println("Buzz");}
        else if (i % 5 == 0 && i % 3 == 0) {
          System.out.println("fizzBuzz");
        } else {
          System.out.println("Nope Fizz && Nope Buzz");
        }
      }
    }
  }

