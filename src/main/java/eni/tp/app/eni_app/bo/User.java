package eni.tp.app.eni_app.bo;

import java.security.PublicKey;

public class User {
  public String email;
  public String password;

    public User() {
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;

    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
