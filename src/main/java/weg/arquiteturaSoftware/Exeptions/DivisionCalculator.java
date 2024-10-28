package weg.arquiteturaSoftware.Exeptions;

public class DivisionCalculator {
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não permitida");
        }
        return a / b;
    }
}