package weg.arquiteturaSoftware.Parametrizados;

public class TaxCalculator {
    public double calculateTax(double income) {
        if (income <= 10000) {
            return income * 0.1;
        } else if (income <= 20000) {
            return income * 0.15;
        } else {
            return income * 0.2;
        }
    }
}