package Java.Day4.a;

import java.util.*;
import java.io.*;

public class Solution {
  public static void main(String[] args) {
    try {
      long res = 0;
      File input = new File("java/Day4/a/input.txt");
      FileWriter myWriter = new FileWriter("java/Day4/a/output.txt");
      Scanner myReader = new Scanner(input);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        // Todo
        int[][] inputData = new int[2][2];
        String[] formated = data.split(",");
        for (int i = 0; i < 2; i++) {
          String[] temp = formated[i].split("-");
          inputData[i][0] = Integer.parseInt(temp[0]);
          inputData[i][1] = Integer.parseInt(temp[1]);
          System.out.print(inputData[i][0] + " " + inputData[i][1] + " " );
        }
        if (inputData[0][0] >= inputData[1][0] && inputData[0][1] <= inputData[1][1]) {
          res++;
        } else if (inputData[0][0] <= inputData[1][0] && inputData[0][1] >= inputData[1][1]) {
          res++;
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
