package ExeptionsTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import weg.arquiteturaSoftware.Exeptions.DivisionCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DivisionCalculatorTest {

    private DivisionCalculator divisionCalculator;
    private static int contadorTest = 0;

    @Before
    public void setup(){
        contadorTest++;
        System.out.println("Iniciando o teste "+ contadorTest);
        divisionCalculator = new DivisionCalculator();
    }

    @Test
    public void divisaoValida(){
        assertEquals(5, divisionCalculator.divide(10, 2));
    }

    @Test
    public void divisaoInvalida(){
        assertThrows(IllegalArgumentException.class, () -> divisionCalculator.divide(10, 0));
    }

    @After
    public void finish(){
        System.out.println("Finalizando o teste "+ contadorTest);
    }

}
