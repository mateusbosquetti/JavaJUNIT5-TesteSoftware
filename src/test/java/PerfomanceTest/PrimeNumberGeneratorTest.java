package PerfomanceTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import weg.arquiteturaSoftware.Performance.PrimeNumberGenerator;

public class PrimeNumberGeneratorTest {

    private PrimeNumberGenerator primeNumberGenerator;

    @BeforeAll
    public static void inicializeTest() {
        System.out.println("Teste de performance iniciado");
    }

    @BeforeEach
    public void setup() {
        primeNumberGenerator = new PrimeNumberGenerator();
    }

    @Test
    public void testPerformance() {
        long starTime = System.nanoTime();

        primeNumberGenerator.generatePrimes(100);

        long endTime = System.nanoTime();
        long durationNative = endTime - starTime;
        System.out.println("Tempo de duração: " + durationNative + " nanosegundos");
    }

    @AfterAll
    public static void finalizeTest() {
        System.out.println("Teste de performance finalizado");
    }
}
