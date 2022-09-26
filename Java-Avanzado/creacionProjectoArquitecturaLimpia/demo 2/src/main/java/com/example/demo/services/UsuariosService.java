package com.example.demo.services;

import com.example.demo.entities.Usuario;
import com.example.demo.entities.UsuarioBuilder;
import com.example.demo.repositories.UsuariosDB;
import com.example.demo.repositories.UsuariosDBFactory;
import com.example.demo.repositories.UsuariosDBFichero;
import com.example.demo.repositories.UsuariosDBMemoria;
import org.springframework.stereotype.Service;


import java.util.ArrayList;

@Service
public class UsuariosService {
    // UsuariosDB usuariosDB = new UsuariosDBFichero("src/main/java/com/example/demo/db/usuarios.txt");
    UsuariosDB usuariosDB;

    public UsuariosService() {
        String tipoDeBBDD = "fichero";
        UsuariosDBFactory usuariosDBFactory = new UsuariosDBFactory(tipoDeBBDD);
        usuariosDB = usuariosDBFactory.getDataBaseInstance();
    }

    public ArrayList<Usuario> listar() {
        return usuariosDB.listar();
    }

    public Usuario obtener(String username) {
        Usuario usuario = new Usuario();
        usuario.setUsername(username);

        return usuariosDB.buscar(usuario);
    }

    public void insertar(Usuario usuario) {
        if (usuariosDB.buscar(usuario) != null) {
            return;
        }
        Usuario usuarioB = crearUsuarioReal(usuario);
        usuariosDB.insertar(usuarioB);
    }

    public void eliminar(String username) {
        Usuario usuario = new Usuario();
        usuario.setUsername(username);
        usuariosDB.eliminar(usuario);
    }

    private Usuario crearUsuarioReal(Usuario usuario) {
        return new UsuarioBuilder(usuario.getUsername())
                .setName(usuario.getName())
                .setEmail(usuario.getEmail())
                .setNivelAcceso(usuario.getNivelAcceso())
                .build();
    }
}
