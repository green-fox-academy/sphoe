public class TodoPrint {
  public static void main(String... args) {
    /*StringBuffer todo = new StringBuffer();
    todo.append("My toDo list:\n");
    todo.append(System.getProperty("line.spearator"));
    todo.append(" - Download games");
    todo.append(System.getProperty("line.separator"));
    todo.append("    "  +" -Diablo");
    System.out.println(todo);
    String todoText = " - Buy milk\n";
    System.out.println(todoText);
    // Add "My todo:" to the beginning of the todoText
    // Add " - Download games" to the end of the todoText
    // Add " - Diablo" to the end of the todoText but with indention


    // Expected output:

    // My todo:
    //  - Buy milk
    //  - Download games
    //      - Diablo

*/

    String todoText = " - Buy milk\n";
    // Add "My todo:" to the beginning of the todoText
    // Add " - Download games" to the end of the todoText
    // Add " - Diablo" to the end of the todoText but with indention

    // Expected output:

    // My todo:
    //  - Buy milk
    //  - Download games
    //      - Diablo
    todoText = "My todo:\n".concat(todoText);
    todoText = todoText.concat(" - Download games\n");
    todoText = todoText.concat("\t - Diablo\n");
// todoText= todoText.concat("").contcat("")
    System.out.println(todoText);
  }
}

