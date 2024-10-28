package TDDtest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import weg.arquiteturaSoftware.TDD.FractionCalculator;

public class FractionTest {

    FractionCalculator fractionCalculator;

    @Before
    public void setup() {
        System.out.println("Iniciando teste");
        fractionCalculator = new FractionCalculator();
    }

    @Test
    public void somarDenominadorIgual() {
        String resultado = fractionCalculator.somarFracao(2, 2, 3, 2);
        Assert.assertEquals("5.0/2.0", resultado);
    }

    @Test
    public void somarDenomidadorDiferente() {
        String resultado = fractionCalculator.somarFracao(1, 5, 2, 3);
        Assert.assertEquals("13.0/15.0", resultado);
    }

    @Test
    public void subtrairDenominadorIgual() {
        String resultado = fractionCalculator.subtrairFracao(11, 2, 10, 2);
        Assert.assertEquals("1.0/2.0", resultado);
    }

    @Test
    public void multiplicarDenominadorIgual() {
        String resultado = fractionCalculator.multiplicarFracao(2, 2, 3, 2);
        Assert.assertEquals("6.0/4.0", resultado);
    }
    @Test
    public void multiplicarDenominadorDiferente() {
        String resultado = fractionCalculator.multiplicarFracao(2, 3, 3, 4);
        Assert.assertEquals("6.0/12.0", resultado);
    }

    @After
    public void end() {
        System.out.println("Teste finalizado!");
    }



}
