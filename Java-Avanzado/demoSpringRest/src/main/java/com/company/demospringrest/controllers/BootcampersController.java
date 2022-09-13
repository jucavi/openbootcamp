package com.company.demospringrest.controllers;

import com.company.demospringrest.models.Bootcamper;
import com.company.demospringrest.services.BootcamperService;
import org.springframework.stereotype.Component;


import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.List;

@Component
@Path("/")
public class BootcampersController {

    private BootcamperService bootcamperService;

    public BootcampersController(BootcamperService bootcamperService) {
        this.bootcamperService = bootcamperService;

        this.bootcamperService.add(new Bootcamper("Uno"));
        this.bootcamperService.add(new Bootcamper("Dos"));
        this.bootcamperService.add(new Bootcamper("Tres"));
        this.bootcamperService.add(new Bootcamper("Cuatro"));
        this.bootcamperService.add(new Bootcamper("Cinco"));
        this.bootcamperService.add(new Bootcamper("Seis"));


    }

    @GET
    @Path("/bootcampers")
    @Produces("application/json")
    public List<Bootcamper> findAll() {
        return bootcamperService.getAll();
    }

    @POST
    @Path("/bootcampers")
    @Produces("application/json")
    @Consumes("application/json")
    public Response setBootcamper(Bootcamper bootcamper) {
        bootcamperService.add(bootcamper);
        return Response.created(
                URI.create("/bootcampers/" + bootcamper.getName())
        ).build();
    }

    @GET
    @Path("/bootcampers/{name}")
    @Produces("application/json")
    public Bootcamper find(@PathParam("name") String name) {
        return bootcamperService.getBootcamper(name);
    }
}
