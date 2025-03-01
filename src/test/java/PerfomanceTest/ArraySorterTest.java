package PerfomanceTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import weg.arquiteturaSoftware.Performance.ArraySorter;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArraySorterTest {

    private ArraySorter arraySorter;
    private static int contadorTest = 0;

    @Before
    public void setup() {
        arraySorter = new ArraySorter();
        contadorTest++;
        System.out.println("Iniciando o teste " + contadorTest);
    }

    @Test
    public void ordenandoLista1() {
        List<Integer> list = new ArrayList<>();
        for (int i = 10; i > 0; i--) {
            list.add(i);
        }
        long start = System.nanoTime();
        arraySorter.sort(list);
        long end = System.nanoTime();
        long duration = end - start;
        System.out.println("Duração é de " + duration + " nanos");
        List<Integer> listSorted = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(listSorted, list);
    }

    @After
    public void end() {
        System.out.println("Finalizando o teste " + contadorTest);
    }

}
