package ParametrizadosTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import weg.arquiteturaSoftware.Parametrizados.PalindromeChecker;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeCheckerTest {

    private static int contadorTest = 0;
    private PalindromeChecker palindromeChecker;


    @ParameterizedTest
    @CsvSource({"A man a plan a canal Panama, true", "ovO, true", "abc, false"})
    public void isPalindromeTest(String input, boolean result) {
        palindromeChecker = new PalindromeChecker();
        boolean isPalindrome = palindromeChecker.isPalindrome(input);
        assertEquals(result, isPalindrome);
    }

    @ParameterizedTest
    @CsvSource({"{}{}, false", "{[}}, false", "´´, true"})
    public void isPalindromeTest2(String input, boolean result) {
        palindromeChecker = new PalindromeChecker();
        boolean isPalindrome = palindromeChecker.isPalindrome(input);
        assertEquals(result, isPalindrome);
    }



}
