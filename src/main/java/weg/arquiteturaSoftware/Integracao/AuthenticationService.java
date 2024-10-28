package weg.arquiteturaSoftware.Integracao;

public class AuthenticationService {
    private String name;
    private String password;

    public AuthenticationService() {
        this.name = "admin";
        this.password = "123";
    }

    public boolean authenticate(String user, String password) {
        return this.name.equals(user) && this.password.equals(password);
    }
}
