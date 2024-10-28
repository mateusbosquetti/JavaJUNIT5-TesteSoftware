package TDDtest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import weg.arquiteturaSoftware.TDD.BancAccount;

import static org.junit.jupiter.api.Assertions.*;

public class BancAccountTest {

    BancAccount bancAccount;
    private static int contadorTeste = 0;

    @Before
    public void setup(){
        bancAccount = new BancAccount();
        contadorTeste++;
        System.out.println("Iniciando o teste "+contadorTeste);
    }

    @Test
    public void testDepositar(){
        double valor = 100;
        bancAccount.Depositar(valor);
        assertEquals(100, bancAccount.getSaldo());
    }

    @Test
    public void sacarDinheiroValido(){
        double valor = 100;
        bancAccount.setSaldo(200);
        assertTrue(bancAccount.sacar(100));
    }

    @Test
    public void sacarDinheiroInvalido(){
        double valor = 100;
        bancAccount.setSaldo(50);
        assertFalse(bancAccount.sacar(100));
    }

    @Test
    public void consultarSaldo(){
        bancAccount.setSaldo(100);
        assertEquals(100, bancAccount.getSaldo());
    }

    @After
    public void afterTest(){
        System.out.println("Finalizando o teste "+contadorTeste);
    }
}
