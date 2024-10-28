package IntegracaoTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import weg.arquiteturaSoftware.Integracao.AuthenticationService;
import weg.arquiteturaSoftware.Integracao.BankService;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BankServiceAuthenticationTest {

    private static int contadorTest = 0;
    private BankService bankService;

    @Before
    public void setup() {
        AuthenticationService authService = new AuthenticationService();
        contadorTest++;
        System.out.println("Iniciando o teste "+ contadorTest);
        bankService = new BankService(authService);
    }

    @Test
    public void loginTestValido() {
        boolean result = bankService.login("admin", "123");
        System.out.println("Login válido!");
        assertTrue(result);
    }

    @Test
    public void loginTestInvalido() {
        boolean result = bankService.login("admin", "1234");
        System.out.println("Login inválido!");
        assertFalse(result);
    }

    @After
    public void end(){
        System.out.println("Finalizando o teste "+ contadorTest);
    }

}
