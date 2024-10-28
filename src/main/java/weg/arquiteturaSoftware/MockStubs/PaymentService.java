package weg.arquiteturaSoftware.MockStubs;

public class PaymentService {
    public boolean processPayment(String userId, double amount) {
        return amount > 0;
    }
}