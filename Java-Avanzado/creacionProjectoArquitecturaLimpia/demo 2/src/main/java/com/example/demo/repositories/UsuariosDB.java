package com.example.demo.repositories;

import com.example.demo.entities.Usuario;

import java.util.ArrayList;

public interface UsuariosDB {

    ArrayList<Usuario> listar();
    Usuario buscar(Usuario usuario);
    void insertar(Usuario usuario);
    void eliminar(Usuario usuario);
}
