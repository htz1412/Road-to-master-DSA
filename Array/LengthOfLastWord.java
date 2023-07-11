/*
 * Problem Link :https://leetcode.com/problems/length-of-last-word/?envType=study-plan-v2&envId=top-interview-150
 */

public class LengthOfLastWord {
  public int lengthOfLastWord(String s) {
    s = s.stripTrailing();
    int i = s.length();

    while (--i >= 0 && s.charAt(i) != ' ');

    return s.length() - (i < 0 ? 0 : i + 1);
  }
}