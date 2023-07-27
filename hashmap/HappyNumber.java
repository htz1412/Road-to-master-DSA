/*
 * Problem Link : https://leetcode.com/problems/happy-number/?envType=study-plan-v2&envId=top-interview-150
 */

public class HappyNumber {
    public boolean isHappy(int n) {
        int result = n;

        while (result >= 10) {
            int num = result;
            result = 0;
            while (num != 0) {
                result += Math.pow(num % 10, 2);
                num /= 10;
            }

        }

        return result == 1 || result == 7;
    }
}
