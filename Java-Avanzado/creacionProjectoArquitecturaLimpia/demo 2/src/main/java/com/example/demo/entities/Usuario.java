package com.example.demo.entities;

// POJO Plai-Old Data Object
public class Usuario {
    private String username;
    private String name;
    private String email;
    private int nivelAcceso;

    public Usuario() {}
    public Usuario(String username, String name, String email, int nivelAcceso) {
        this.username = username;
        this.name = name;
        this.email = email;
        this.nivelAcceso = nivelAcceso;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNivelAcceso() {
        return nivelAcceso;
    }

    public void setNivelAcceso(int nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }

    @Override
    public String toString() {
        return "Nombre de usuario: " + getUsername() + "\r\n"
                + "nombre: " + getName() + "\r\n"
                + "email: " + getEmail() + "\r\n"
                + "nivel de acceso: " + getNivelAcceso();
    }
}
