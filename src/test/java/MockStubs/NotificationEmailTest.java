package MockStubs;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import weg.arquiteturaSoftware.MockStubs.NotificationService;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NotificationEmailTest {

    NotificationService notificationService;

    @Before
    public void setup() {
        System.out.println("Iniciando teste MOCK");
    }

    @Test
    public void sendEmail() {
        notificationService = Mockito.mock(NotificationService.class);
        Mockito.when(notificationService.sendNotification(Mockito.anyString(), Mockito.anyString())).thenReturn(true);
        boolean result = notificationService.sendNotification("email", "message");
        assertTrue(result);
    }
    @Test
    public void sendEmailInvalid() {
        notificationService = Mockito.mock(NotificationService.class);
        Mockito.when(notificationService.sendNotification(Mockito.argThat(x -> x.contains("@")), Mockito.anyString())).thenReturn(true);
        boolean result = notificationService.sendNotification("email", "message");
        assertFalse(result);
    }

    @After
    public void end(){
        System.out.println("Testes finalizado!");
    }



}
