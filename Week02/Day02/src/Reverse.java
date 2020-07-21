import static jdk.nashorn.internal.objects.NativeArray.reverse;

public class Reverse {
  public static void main(String... args) {
    //System.out.println(reverseString(
        //" .eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI"));;
    System.out.println(reverseString("etrök"));
        String toBeReversed =
        ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
    // Create a method that can reverse a String, which is passed as the parameter
    // Use it on this reversed string to check it!
    // Try to solve this using charAt() first, and optionally anything else after.
   /* StringBuilder reverseString = new StringBuilder();
    reverseString.append(toBeReversed);
    reverseString = reverseString.reverse();
    System.out.println(reverseString);
  }*/
  }

  public static String reverseString(String translate) {
    char[] ch = translate.toCharArray();
    String doboz = " ";
    for (int i = ch.length-1; i >= 0; i--) {
      doboz += ch[i];
    }
    return doboz;

  }

}


