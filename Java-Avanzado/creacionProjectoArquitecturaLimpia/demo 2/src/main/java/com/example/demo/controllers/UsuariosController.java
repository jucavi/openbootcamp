package com.example.demo.controllers;

import com.example.demo.entities.Usuario;
import com.example.demo.services.UsuariosService;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.List;

@Component
@Path("/")
public class UsuariosController {
    private final UsuariosService usuariosService;

    public UsuariosController(UsuariosService usuariosService) {
        this.usuariosService = usuariosService;
    }

    @GET
    @Path("/usuarios")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Usuario> listarTodos() { return this.usuariosService.listar(); }

    @GET
    @Path("/usuarios/{nombre}")
    @Produces(MediaType.APPLICATION_JSON)
    public Usuario listarUsuario(@PathParam("nombre") String nombre) { return this.usuariosService.obtener(nombre); }

    @POST
    @Path("/usuarios")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response crearUsuario(Usuario usuario) {
        usuariosService.insertar(usuario);

        return Response.created(
                URI.create("/usuarios" + usuario.getUsername())
        ).build();
    }

    @DELETE
    @Path("/usuarios/{nombre}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response borrarUsuario(@PathParam("nombre") String nombre) {
        usuariosService.eliminar(nombre);

        return Response.ok().build();
    }
}
