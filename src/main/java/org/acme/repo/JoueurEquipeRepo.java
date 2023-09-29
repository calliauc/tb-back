package org.acme.repo;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.acme.models.JoueurEquipe;

@ApplicationScoped
public class JoueurEquipeRepo implements PanacheRepository<JoueurEquipe> {

}
