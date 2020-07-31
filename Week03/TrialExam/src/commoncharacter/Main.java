package commoncharacter;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    try {
      Path filePath = Paths.get("exam-trial-basics\\cli-exercise\\projects\\countchar.txt");
      List<String> readFiles = Files.readAllLines(filePath);
      System.out.println(readFiles.toString());
    } catch (Exception e) {
      System.out.println("File does not exist!!");
    }
  }
}

