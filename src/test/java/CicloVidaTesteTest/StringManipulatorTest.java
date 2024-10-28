package CicloVidaTesteTest;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import weg.arquiteturaSoftware.CicloVidaTeste.StringManipulator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringManipulatorTest {

    StringManipulator stringManipulator;
    private static int contador = 0;

    @Before
    public void setup() {
        stringManipulator = new StringManipulator();
        contador++;
        System.out.println("Executando o teste "+ contador);
    }

    @BeforeEach
    public void eachTest() {
        System.out.println("Executando o teste "+ contador);
    }

    @Test
    public void toUpperCaseTest() {
        String input;
        String result;

        input = "Mateus";
        result = stringManipulator.toUpperCase(input);
        assertEquals("MATEUS", result);

        input = "pálâvràcõmaçéntor";
        result = stringManipulator.toUpperCase(input);
        assertEquals("PÁLÂVRÀCÕMAÇÉNTOR", result);

    }

    @Test
    public void reverseTest() {
        String input;
        String result;

        input = "Mateus";
        result = stringManipulator.reverse(input);
        assertEquals("suetaM", result);

        input = "pálâvràcõmaçéntor";
        result = stringManipulator.reverse(input);
        assertEquals("rotnéçamõcàrvâláp", result);
    }

    @AfterEach
    public void afterEachTest() {
        System.out.println("Fim do teste "+ contador);
    }

}
