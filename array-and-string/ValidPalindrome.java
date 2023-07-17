/*
 * Problem Link : https://leetcode.com/problems/valid-palindrome/?envType=study-plan-v2&envId=top-interview-150
 */

public class ValidPalindrome {

  public boolean isPalindrome(String s) {
    s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    int start = 0;
    int end = s.length() - 1;

    while (start < end) {
      if (s.charAt(start++) != s.charAt(end--)) {
        return false;
      }
    }

    return true;
  }

  // From solution tab
  public static boolean isPalindromeOptimalSolution(String s) {
    int start = 0;
    int end = s.length() - 1;
    while (start <= end) {
      char curFirst = s.charAt(start);
      char curLast = s.charAt(end);
      if (!Character.isLetterOrDigit(curFirst)) {
        start++;
      } else if (!Character.isLetterOrDigit(curLast)) {
        end--;
      } else {
        if (Character.toLowerCase(curFirst) != Character.toLowerCase(curLast)) {
          return false;
        }
        start++;
        end--;
      }
    }
    return true;
  }
}