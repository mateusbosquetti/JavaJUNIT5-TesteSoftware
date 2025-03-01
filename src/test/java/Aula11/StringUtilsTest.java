package Aula11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import weg.arquiteturaSoftware.Aula11.Palindrome.StringUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest {

    private StringUtils stringUtils;

    @BeforeEach
    public void setup() {
        stringUtils = new StringUtils();
    }
    @Test
    public void testReverseWithValidInput() {
        //arrange
        String input = "hello";

        //act
        String result = stringUtils.reverse(input);

        //assert
        assertEquals("olleh", result, "The reverse of 'hello' should be 'olleh'");
    }

    @Test
    public void testReverseWithEmptyString(){
        //arrange
        String input = "";

        //act
        String result = stringUtils.reverse(input);

        //assert
        assertEquals("", result, "The reverse of '' should be ''");
    }
    @Test
    public void testIsPalindrome(){
        String input = "madam";
        boolean result = stringUtils.isPalindrome(input);
        assertTrue(result, "The word 'madam' should be a palindrome");
    }





}
