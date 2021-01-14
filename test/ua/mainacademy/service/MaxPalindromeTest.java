package ua.mainacademy.service;

import org.junit.jupiter.api.Test;
import ua.mainacademy.service.service.MaxPalindrome;

import static org.junit.jupiter.api.Assertions.*;

class MaxPalindromeTest {

    @Test
    void isPalindrome() {
        assertTrue(MaxPalindrome.isPalindrome(9009));
    }
}