package org.acme.Ressources;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.acme.models.Joueur;
import org.acme.repo.JoueurRepo;

import java.util.List;
import java.util.stream.Collectors;

@Path("/joueurs")

public class JoueurRessource {

    @Inject
    JoueurRepo repository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Joueur> getPlayers(){
        return repository.listAll();
    }

    @GET
    @Path("/caps")
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> caps(){
        return repository.listAll().stream()
                .map(joueur -> joueur.name.toUpperCase())
                .collect(Collectors.toList());
    }

    @GET
    @Path("/search")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Joueur> getPlayerBy(Joueur joueur){
        return repository.findByV2(joueur);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response savePlayer(Joueur joueur){
        repository.persist(joueur);
        return Response.status(Response.Status.CREATED).build();
    }

}
