package ParametrizadosTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import weg.arquiteturaSoftware.Parametrizados.TaxCalculator;

import static org.junit.jupiter.api.Assertions.*;

public class TaxCalculatorCsvSourceTest {
    private TaxCalculator calculator;

    @BeforeAll
    public static void inicializeTest() {
        System.out.println("Testes iniciados");
    }

    @BeforeEach
    public void setup() {
        calculator = new TaxCalculator();
    }

    @ParameterizedTest
    @CsvSource({"10000, 1000.0", "21500, 4300.0", "263321, 52664.200000000004", "15600, 2340.0", "17234, 2585.1"})
    public void teste(double valor, double expected) {
        assertEquals(expected, calculator.calculateTax(valor));
    }

    @AfterAll
    public static void tearDown() {
        System.out.println("Testes finalizados");
    }

}
