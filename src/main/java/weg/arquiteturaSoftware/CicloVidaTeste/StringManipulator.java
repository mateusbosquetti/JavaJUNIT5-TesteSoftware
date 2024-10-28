package weg.arquiteturaSoftware.CicloVidaTeste;

public class StringManipulator {
    public String toUpperCase(String input) {
        return input.toUpperCase();
    }
    public String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}