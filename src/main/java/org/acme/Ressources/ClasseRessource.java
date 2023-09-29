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
    @Produces(MediaType.APPLICATION_JSON)
    public List<Classe> getClasses(){
        return repository.listAll();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response saveClasse(Classe classe){
        repository.persist(classe);
        return Response.status(Response.Status.CREATED).build();
    }

    @PUT
    @Path("/{id}")
    @Transactional
    public Classe update(Long id, Classe classe) {
        Classe entity = Classe.findById(id);
        if(entity == null) {
            throw new NotFoundException();
        }

        // map all fields from the person parameter to the existing entity
        entity.name = classe.name;

        return entity;
    }

}
