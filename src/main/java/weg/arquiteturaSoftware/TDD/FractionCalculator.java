package weg.arquiteturaSoftware.TDD;

public class FractionCalculator {

    public String somarFracao(double num1, double den1, double num2, double den2) {

        if (den1 == den2) {
            return (num1 + num2) + "/" + den1;
        } else {
            return (num1 * den2 + num2 * den1) + "/" + (den1 * den2);
        }
    }

    public String subtrairFracao(double num1, double den1, double num2, double den2) {
        if (den1 == den2) {
            return (num1 - num2) + "/" + den1;
        } else {
            return (num1 - num2) + "/" + den1;
        }
    }

    public String multiplicarFracao(double num1, double den1, double num2, double den2) {
        return (num1 * num2) + "/" + (den1 * den2);
    }


}
