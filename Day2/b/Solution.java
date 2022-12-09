import java.util.*;
import java.io.*;

class Solution {
  public static void main(String[] args) {
    try {
      long res = 0;
      File input = new File("input.txt");
      FileWriter myWriter = new FileWriter("output.txt");
      HashMap<String,Integer> m = new HashMap<>();
      m.put("A X", 3);
      m.put("A Y", 4);
      m.put("A Z", 8);
      m.put("B X", 1);
      m.put("B Y", 5);
      m.put("B Z", 9);
      m.put("C X", 2);
      m.put("C Y", 6);
      m.put("C Z", 7);
      Scanner myReader = new Scanner(input);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        res += m.get(data);
      }
      myReader.close();
      myWriter.write("" + res);
      myWriter.close();
    } catch (IOException  e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}