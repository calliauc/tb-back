package org.acme.Ressources;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.acme.models.Player;
import org.acme.repo.PlayerRepo;

import java.util.List;
import java.util.stream.Collectors;

@Path("/players")

public class PlayerRessource {

    @Inject
    PlayerRepo repository;
    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Player> getPlayers(){
        return repository.listAll();
    }

    @GET
    @Path("/caps")
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> caps(){
        return repository.listAll().stream()
                .map(player -> player.name.toUpperCase())
                .collect(Collectors.toList());
    }


    @GET
    @Path("/search")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Player> getPlayerBy(Player player){
        return repository.findByV2(player);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response savePlayer(Player player){
        repository.persist(player);
        return Response.status(Response.Status.CREATED).build();
    }

}
