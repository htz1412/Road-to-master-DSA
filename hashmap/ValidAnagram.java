/*
 * Problem Link : https://leetcode.com/problems/valid-anagram/?envType=study-plan-v2&envId=top-interview-150
 */

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("ab", "a"));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            hashMap.put(s.charAt(i), hashMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char curChar = t.charAt(i);

            if (!hashMap.containsKey(curChar)) return false;

            hashMap.put(curChar, hashMap.get(curChar) - 1);

            if (hashMap.get(curChar) == 0) hashMap.remove(curChar);
        }

        return true;
    }

    public static boolean isAnagramOptimalSolution(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for (int j : freq) {
            if (j != 0) return false;
        }

        return true;
    }
}
