public class Factorio {
  //  Create the usual class wrapper
//  and main method on your own.
  // - Create a function called `factorio`
//   that returns it's input's factorial
  public static void main(String[] args) {
    System.out.println(factorio(6));
  }

  public static int factorio(int input) {

    int result = 1;
    for (int i = 1; i <= input; i++) {
      result *= i;
    }
    return result;
  }
}

