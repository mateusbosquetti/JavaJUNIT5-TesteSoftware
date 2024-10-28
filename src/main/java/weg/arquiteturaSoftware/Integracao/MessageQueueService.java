package weg.arquiteturaSoftware.Integracao;

public class MessageQueueService {
    public boolean sendMessage(String message) {
        //Simulação de envio de mensagem para uma fila

        if (message == null || message.isEmpty()) {
            System.out.println("Falha ao enviar a mensagem");
            return false;
        }

        System.out.println("Mensagem enviada: " + message);
        return true;
    }
}