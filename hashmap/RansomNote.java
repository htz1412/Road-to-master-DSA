/*
 * Problem Link : https://leetcode.com/problems/ransom-note/?envType=study-plan-v2&envId=top-interview-150
 */

import java.util.HashMap;

public class RansomNote {
  public static boolean canConstruct(String ransomNote, String magazine) {
    HashMap<Character, Integer> map = new HashMap<>();

    for (int i = 0; i < magazine.length(); i++) {
      char curChar = magazine.charAt(i);
      map.put(curChar, map.getOrDefault(curChar, 0) + 1);
    }

    for (int i = 0; i < ransomNote.length(); i++) {
      char curChar = ransomNote.charAt(i);

      if (map.getOrDefault(curChar, 0) == 0) {
        return false;
      }

      map.put(curChar, map.get(curChar) - 1);
    }

    return true;
  }

  // From solution tab
  public boolean canConstructOptimalSolution(String ransomNote, String magazine) {
    if (ransomNote.length() > magazine.length())
      return false;

    int[] alphabetsCounter = new int[26];

    for (char c : magazine.toCharArray())
      alphabetsCounter[c - 'a']++;

    for (char c : ransomNote.toCharArray()) {
      if (alphabetsCounter[c - 'a'] == 0)
        return false;

      alphabetsCounter[c - 'a']--;
    }
    return true;
  }
}