package Day3.a;

import java.util.*;
import java.io.*;

public class Solution {
  public static void main(String[] args) {
    try {
      long res = 0;
      File input = new File("input.txt");
      FileWriter myWriter = new FileWriter("output.txt");
      Scanner myReader = new Scanner(input);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        // Todo
        char[] carr = data.toCharArray();
        HashSet<Character> s = new HashSet<>();
        for (int i = 0; i < carr.length/2; i++) {
          s.add(carr[i]);
        }
        for (int i = carr.length/2; i < carr.length; i++) {
          if (s.contains(carr[i])) {
            if (Character.isLowerCase(carr[i])) {
              res+= Character.toLowerCase(carr[i]) - 'a' + 1;
            } else {
              res+= Character.toLowerCase(carr[i]) - 'a' + 27;
            }
            break;
          }
        }
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
