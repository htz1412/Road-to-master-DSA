/*
 * Problem Link : https://leetcode.com/problems/is-subsequence/?envType=study-plan-v2&envId=top-interview-150
 */

public class IsSubsequence {
  public static boolean isSubsequence(String s, String t) {
    int sIndex = 0, tIndex = 0;
    while (sIndex < s.length() && tIndex < t.length()) {
      if (s.charAt(sIndex) == t.charAt(tIndex)) {
        sIndex++;
      }
      tIndex++;
    }

    return sIndex == s.length();
  }
}