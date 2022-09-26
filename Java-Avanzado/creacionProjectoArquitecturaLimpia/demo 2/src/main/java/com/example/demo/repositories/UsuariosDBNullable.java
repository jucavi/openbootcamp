package com.example.demo.repositories;

import com.example.demo.entities.Usuario;

import java.util.ArrayList;

public class UsuariosDBNullable implements UsuariosDB {
    @Override
    public ArrayList<Usuario> listar() {
        return null;
    }

    @Override
    public Usuario buscar(Usuario usuario) {
        return null;
    }

    @Override
    public void insertar(Usuario usuario) {}

    @Override
    public void eliminar(Usuario usuario) {}
}
