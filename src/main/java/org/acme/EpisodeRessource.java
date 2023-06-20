package org.acme;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;
import java.util.stream.Collectors;

@Path("/episodes")
public class EpisodeRessource {

    @Inject
    EpisodeRepo repository;
    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Episode> getEpisodes(){
        return repository.listAll();
    }

    @GET
    @Path("/caps")
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> caps(){
        return repository.listAll().stream()
                .map(episode -> episode.title.toUpperCase())
                .collect(Collectors.toList());
    }


    @GET
    @Path("/{title}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Episode> getEpisode(@PathParam("title") String title){
        return repository.findByTitle(title);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response saveEpisode(Episode episode){
        repository.persist(episode);
        return Response.status(Response.Status.CREATED).build();
    }

}
