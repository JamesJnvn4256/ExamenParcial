package com.example.ExamenParcialVelezmoro.model;

/**
 *
 * @author jnvn4
 */
public class UsuarioModel {
    private String username;
    private String password;

    // Constructor vacío
    public UsuarioModel() {}

    // Constructor con parámetros
    public UsuarioModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getters y Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
