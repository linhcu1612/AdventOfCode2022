package Java;

import java.util.*;
import java.io.*;

public class Solution {
  public static void main(String[] args) {
    try {
      File input = new File("input.txt");
      FileWriter myWriter = new FileWriter("output.txt");
      Scanner myReader = new Scanner(input);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        // Todo
      }
      myReader.close();
      myWriter.close();
    } catch (IOException  e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
