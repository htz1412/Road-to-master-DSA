public class LongestCommonPrefix {
  public static String longestCommonPrefix(String[] strs) {
    String str = strs[0];
    int minCommonIndex = str.length();

    for (int i = 1; i < strs.length; i++) {
      int currentIndex = 0;
      for (int j = 0; j < strs[i].length() && j < str.length(); j++) {
        if (strs[i].charAt(j) == str.charAt(j)) {
          currentIndex++;
        } else {
          break;
        }
      }
      minCommonIndex = Math.min(minCommonIndex, currentIndex);
    }

    return minCommonIndex == 0 ? "" : str.substring(0, minCommonIndex);
  }
}