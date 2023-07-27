/*
    Problem Link : https://leetcode.com/problems/word-pattern/?envType=study-plan-v2&envId=top-interview-150
 */

import java.util.HashMap;
import java.util.Objects;

public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        String[] splittedString = s.split(" ");

        if (pattern.length() != splittedString.length)
            return false;

        HashMap<Character, String> map = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            if (map.containsKey(pattern.charAt(i))) {
                if (!Objects.equals(map.get(pattern.charAt(i)), splittedString[i]))
                    return false;
            } else if (map.containsValue(splittedString[i])) {
                return false;
            } else
                map.put(pattern.charAt(i), splittedString[i]);
        }

        return true;
    }
}
