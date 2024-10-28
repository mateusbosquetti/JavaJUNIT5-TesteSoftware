package weg.arquiteturaSoftware.Aula11.Palindrome;

public class StringUtils {

    public String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public boolean isPalindrome(String input) {
        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();
        return cleanedInput.equals(new
                StringBuilder(cleanedInput).reverse().toString());
    }

}
