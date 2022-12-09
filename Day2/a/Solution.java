import java.util.*;
import java.io.*;

class Solution {
  public static void main(String[] args) {
    long score = 0;
    HashMap<String,Integer> map = new HashMap<String,Integer>();
    //win
    map.put("A Y",8);
    map.put("B Z",9);
    map.put("C X",7);
    //draw
    map.put("A X",4);
    map.put("B Y",5);
    map.put("C Z",6);
    //lose
    map.put("A Z",3);
    map.put("B X", 1);
    map.put("C Y", 2);

    try {
      File input = new File("./input.txt");
      FileWriter output = new FileWriter("./output.txt");
      Scanner myReader = new Scanner(input);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        score += map.getOrDefault(data,0);
      }
      myReader.close();
      output.write("" + score);
      output.close();
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}