package IntegracaoTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import weg.arquiteturaSoftware.Integracao.MessageQueueService;

import static org.junit.jupiter.api.Assertions.*;

public class MessageQueueServiceTest {
    private MessageQueueService messageQueueService;

    @BeforeAll
    public static void inicializeTest() {
        System.out.println("Testes iniciados");
    }

    @BeforeEach
    public void setup() {
        messageQueueService = new MessageQueueService();
    }

    @Test
    public void sendCorrectMessageTest() {
        assertTrue(messageQueueService.sendMessage("Você recebeu uma nova mensagem"));
    }

    @Test
    public void sendIncorrectMessageTest() {
        assertFalse(messageQueueService.sendMessage(""));
        assertFalse(messageQueueService.sendMessage(null));
    }

    @AfterAll
    public static void tearDown() {
        System.out.println("Testes finalizados");
    }
}

