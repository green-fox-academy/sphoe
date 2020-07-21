public class TakesLonger {
  public static void main(String... args) {
    String quote =
        "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
    System.out.println(fixedCode(quote,"It","you","namaste"));
    // When saving this quote a disk error has occurred. Please fix it.
    // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
    // Using pieces of the quote variable (instead of just redefining the string)
    // 1.x
/* String str = "always takes longer than";
 System.out.println("Hofstadter's Law: It " + str + " you expect, even when you take into account Hofstadter's Law.");
 //2.x
    String str1 = " always takes longer than ";
    String firstP =quote.substring(0,20);
    String secondP =quote.substring(21,quote.length());
    System.out.println(quote);
    System.out.println(firstP);
    System.out.println(secondP);
    quote= firstP.concat(str1).concat(secondP);
    System.out.println(quote);*/
    //3X.
  }

  public static String fixedCode(String quote, String firstWord, String secondWord,
                                 String insertP) {
    // String str1 = " always takes longer than ";
    String firstP = quote.substring(0, quote.indexOf(firstWord) + firstWord.length());
    String secondP = quote.substring(quote.indexOf(secondWord), quote.length());
    System.out.println(quote);
    System.out.println(firstP);
    System.out.println(secondP);
    quote = firstP.concat(" "+insertP+" ").concat(secondP);

    return quote;
  }
}