public class Sum {
  // Create the usual class wrapper and main method on your own.
  // Write a function called `sum` that returns the sum of numbers from zero to the given parameter
  public static void main(String[] args) {
    int result = 7;
    System.out.println(sum(7));
  }

  public static int sum(int number) {
    int result = 0;
    for (int i = 0; i <= number; i++) {
      result += i;
    }
    return result;
  }
}