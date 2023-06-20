package org.acme;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;
@ApplicationScoped
public class EpisodeRepo implements PanacheRepository<Episode> {
    public List<Episode> findByTitle(String title){
        if (title != null){
            return Episode.find("title", title).list();
        }
        return Episode.listAll();
    }
}
