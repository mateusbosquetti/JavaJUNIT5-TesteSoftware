package CicloVidaTesteTest;

import org.junit.jupiter.api.*;
import weg.arquiteturaSoftware.CicloVidaTeste.FileHandler;

public class FileHandlerTest {
    @BeforeAll
    public static void inicializeTests() {
        FileHandler fileHandler = new FileHandler();
        fileHandler.openFile("teste");
    }

    @BeforeEach
    public void setup() {
        System.out.println("Passando para outro teste");
    }

    @Test
    public void test() {
        System.out.println("Algum teste sendo executado");
    }

    @Test
    public void test2() {
        System.out.println("Mais um teste sendo executado");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Mais um teste finalizado");
    }

    @AfterAll
    public static void finalizeTests() {
        FileHandler fileHandler = new FileHandler();
        fileHandler.closeFile();
    }
}

