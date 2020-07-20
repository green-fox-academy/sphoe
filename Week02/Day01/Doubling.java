public class Doubling {
  // - Create an integer variable named `baseNum` and assign the value `123` to it
// - Create a function called `doubling` that doubles it's input parameter and returns with an integer
// - Print the result of `doubling(baseNum)`
  public static void main(String[] args) {
    int BaseNum = 123;
    System.out.println(doubling(BaseNum));
  }

  public static int doubling(int paramter) {
    int result = (paramter * paramter);
    return result;
  }
}

