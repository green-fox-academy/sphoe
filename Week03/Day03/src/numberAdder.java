public class numberAdder {
  public static void main(String[] args) {
    //Write a recursive function that takes one parameter: n and adds numbers from 1 to n.
    System.out.println(takingNumber(3));
  }
    public static int takingNumber(int n){
      int result = 0;
      for (int i = 1; i <= n; i++) {
        result += i;
      }
      return takingNumber(3);
    }


}