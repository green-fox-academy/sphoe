public class DivideByZero {
  public static void main(String[] args) {
    // Create a function that takes a number
    // divides ten with it,
    // and prints the result.
    // It should print "fail" if the parameter is 0
    divideNumber(35);
    divideNumber(10);
  }
  public static void divideNumber(int number) {
    int divideNum;
    try {
      divideNum = 10 / number;
      System.out.println(divideNum);
    } catch (ArithmeticException a) {
      System.out.println("fail");
    }
  }
}
