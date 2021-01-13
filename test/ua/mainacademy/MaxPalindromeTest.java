package ua.mainacademy.serviсe;

import org.junit.jupiter.api.Test;
import ua.mainacademy.service.MaxPalindrome;

import static org.junit.jupiter.api.Assertions.*;

class MaxPalindromeTest {

    @Test
    void isPalindrome() {
        StringBuilder sb = new StringBuilder(String.valueOf(9009));
        sb.reverse();
        boolean result = MaxPalindrome.isPalindrome(9009);
        assertEquals(sb.toString().equals(String.valueOf(9009)), result);
    }
}