/*
 * Problem Link : https://leetcode.com/problems/roman-to-integer/?envType=study-plan-v2&envId=top-interview-150
 */

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
  public static void main(String[] args) {
    System.out.println(romanToInt("IV"));
  }

  public static int romanToInt(String s) {
    Map<String, Integer> romanToInteger = new HashMap();
    romanToInteger.put("I", 1);
    romanToInteger.put("V", 5);
    romanToInteger.put("X", 10);
    romanToInteger.put("L", 50);
    romanToInteger.put("C", 100);
    romanToInteger.put("D", 500);
    romanToInteger.put("M", 1000);
    romanToInteger.put("IV", 4);
    romanToInteger.put("IX", 9);
    romanToInteger.put("XL", 40);
    romanToInteger.put("XC", 90);
    romanToInteger.put("CD", 400);
    romanToInteger.put("CM", 900);

    int num = 0;
    for (int i = 0; i < s.length(); i++) {
      if (i > 0 && s.charAt(i) != 'I' && romanToInteger.get("" + s.charAt(i - 1) + s.charAt(i)) != null) {
        num -= romanToInteger.get(s.charAt(i - 1) + "");
        num += romanToInteger.get("" + s.charAt(i - 1) + s.charAt(i));
      } else {
        num += romanToInteger.get("" + s.charAt(i));
      }
    }

    return num;
  }

  // From solution tab
  public int romanToIntOptimalSolution(String s) {
    int answer = 0, number = 0, prev = 0;

    for (int j = s.length() - 1; j >= 0; j--) {
      switch (s.charAt(j)) {
        case 'M' -> number = 1000;
        case 'D' -> number = 500;
        case 'C' -> number = 100;
        case 'L' -> number = 50;
        case 'X' -> number = 10;
        case 'V' -> number = 5;
        case 'I' -> number = 1;
      }

      if (number < prev) {
        answer -= number;
      } else {
        answer += number;
      }

      prev = number;
    }
    return answer;
  }
}