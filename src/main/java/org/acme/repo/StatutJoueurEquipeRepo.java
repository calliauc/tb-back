package org.acme.repo;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.acme.models.StatutJoueurEquipe;

@ApplicationScoped
public class StatutJoueurEquipeRepo implements PanacheRepository<StatutJoueurEquipe> {

}
