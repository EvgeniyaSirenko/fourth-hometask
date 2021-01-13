package ua.mainacademy;

import ua.mainacademy.service.LongMultiplication;
import ua.mainacademy.service.MaxPalindrome;

import java.util.logging.Logger;

public class AppRunner {
    private static final Logger LOG = Logger.getLogger(AppRunner.class.getName());

    public static void main(String[] args) {
        int result = MaxPalindrome.getPalindrome();
        LOG.info(String.format("Max palindrome is %s", result));
        //TODO LongMultiplication app
        LongMultiplication lm = new LongMultiplication();
    }
}
