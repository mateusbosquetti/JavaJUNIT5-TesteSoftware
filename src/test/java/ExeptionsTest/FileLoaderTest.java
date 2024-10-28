package ExeptionsTest;

import org.junit.After;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import weg.arquiteturaSoftware.Exeptions.FileLoader;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;

public class FileLoaderTest {
    private FileLoader fileLoader;

    @BeforeEach
    public void setup() {
        fileLoader = new FileLoader();
    }

    @Test
    public void loadFileTest() throws FileNotFoundException {
        assertEquals("Arquivo carregado", fileLoader.loadFile("C:"));
    }

    @Test
    void loadInvalidFileTest() {
        assertThrows(FileNotFoundException.class, () -> fileLoader.loadFile("Teste"));
    }

    @AfterAll
    public static void end(){
        System.out.println("Testes Finalizados!");
    }

}