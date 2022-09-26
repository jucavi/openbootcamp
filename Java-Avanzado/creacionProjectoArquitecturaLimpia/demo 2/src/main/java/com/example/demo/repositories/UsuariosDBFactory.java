package com.example.demo.repositories;

public class UsuariosDBFactory {
    private String tipoDeBBDD;

    public UsuariosDBFactory(String tipoDeBBDD) {
        this.tipoDeBBDD = tipoDeBBDD;
    }
    public UsuariosDB getDataBaseInstance() {
        if (tipoDeBBDD.equalsIgnoreCase("fichero")) {
            return new UsuariosDBFichero("src/main/java/com/example/demo/db/usuarios.txt");
        } else if (tipoDeBBDD.equalsIgnoreCase("memoria")) {
            return new UsuariosDBMemoria();
        }

        return new UsuariosDBNullable();
    }
}
