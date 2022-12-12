package Java.Day1;

import java.util.*;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors

class CalorieCouting {
  public static void main(String[] args) {
    long max = 0;
    long[] arr = new long[257];
    int i = 0;

    try {
      File myObj = new File("data.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        if (data.equals("")) {
          i++;
        } else {
          arr[i] += Integer.parseInt(data);
          if (arr[i] > max) {
            max = arr[i];
          }
        }
      }
      Arrays.sort(arr);
      System.out.println(arr[256]+ arr[255] + arr[254]);
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}