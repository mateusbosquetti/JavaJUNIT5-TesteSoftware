package MockStubs;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import weg.arquiteturaSoftware.MockStubs.PaymentService;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PaymentServiceTest {

    PaymentService paymentService;

    @Before
    public void setup() {
        System.out.println("Iniciando o teste");
    }

    @Test
    public void testPayment() {
        paymentService = Mockito.mock(PaymentService.class);
        Mockito.when(paymentService.processPayment(Mockito.anyString(), Mockito.anyDouble())).thenReturn(true);
        double valor = 0;
        boolean result = paymentService.processPayment("userId", valor);
        assertTrue(result);
    }

    @Test
    public void testPaymentInvalido() {
        paymentService = Mockito.mock(PaymentService.class);
        Mockito.when(paymentService.processPayment(Mockito.anyString(), Mockito.doubleThat(x -> x > 0))).thenReturn(true);
        double valor = -20;
        boolean result = paymentService.processPayment("userId", valor);
        assertFalse(result);
    }

    @After
    public void end(){
        System.out.println("Testes finalizado!");
    }

}
