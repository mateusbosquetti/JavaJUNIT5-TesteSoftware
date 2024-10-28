package weg.arquiteturaSoftware.Integracao;

public class BankService {
    private AuthenticationService authService;
    public BankService(AuthenticationService authService) {
        this.authService = authService;
    }
    public boolean login(String user, String password) {
        return authService.authenticate(user, password);
    }
}