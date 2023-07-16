package org.acme.Ressources;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.acme.models.Classe;
import org.acme.repo.ClasseRepo;

import java.util.List;
import java.util.stream.Collectors;

@Path("/classes")

public class ClasseRessource {

    @Inject
    ClasseRepo repository;

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Classe> getClasses(){
        return repository.listAll();
    }

    @GET
    @Path("/caps")
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> caps(){
        return repository.listAll().stream()
                .map(classe -> classe.name.toUpperCase())
                .collect(Collectors.toList());
    }



    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response saveClasse(Classe classe){
        repository.persist(classe);
        return Response.status(Response.Status.CREATED).build();
    }

}
