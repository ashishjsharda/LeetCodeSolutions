package org.example;
import java.util.Arrays;
//LeetCode :https://leetcode.com/problems/smallest-string-with-a-given-numeric-value/description/
public class SmallestString {

    public String getSmallestString(int n, int k) {
        char[] chars = new char[n];
        Arrays.fill(chars, 'a');

        k -= n;

        for (int i = n - 1; i >= 0; i--) {
            if (k > 25) {
                chars[i] = (char)('a' + 25);
                k -= 25;
            } else {
                chars[i] = (char)('a' + k);
                k = 0;
            }
        }

        return new String(chars);
    }
    public static void main(String[] args) {
        SmallestString solution = new SmallestString();
        int n1 = 3, k1 = 27;
        System.out.println(solution.getSmallestString(n1, k1));

        int n2 = 5, k2 = 73;
        System.out.println(solution.getSmallestString(n2, k2));

    }
}
