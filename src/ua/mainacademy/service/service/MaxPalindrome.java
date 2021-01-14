package ua.mainacademy.service.service;

import java.util.TreeSet;

public class MaxPalindrome {
    public static int getPalindrome () {
        TreeSet<Integer> numbers = new TreeSet<>();
        for (int i = 9999; i >= 1000; i--) {
            for (int j = 9999; j >= i; j--) {
                if (isPalindrome(i * j)) {
                    numbers.add(i * j);
                }
            }
        }
        return numbers.last();
    }

    public static boolean isPalindrome(int number) {
        StringBuilder sb = new StringBuilder(String.valueOf(number));
        sb.reverse();
        return sb.toString().equals(String.valueOf(number));
    }

}
