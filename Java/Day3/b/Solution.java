package Java.Day3.b;

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
        HashSet<Character> set = new HashSet<>();
        String data1 = myReader.nextLine();
        String data2 = myReader.nextLine();
        String data3 = myReader.nextLine();
        for (int i = 0; i < data1.length(); i++) {
          if (!set.contains(data1.charAt(i))) {
            set.add(data1.charAt(i));
            if (data2.indexOf(data1.charAt(i)) != -1 && data3.indexOf(data1.charAt(i)) != -1) {
              if (Character.isLowerCase(data1.charAt(i))) {
                res+= Character.toLowerCase(data1.charAt(i)) - 'a' + 1;
              } else {
                res+= Character.toLowerCase(data1.charAt(i)) - 'a' + 27;
              }
              break;
            }
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
