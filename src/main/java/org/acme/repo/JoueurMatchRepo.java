package org.acme.repo;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.acme.models.JoueurMatch;

@ApplicationScoped
public class JoueurMatchRepo implements PanacheRepository<JoueurMatch> {

}
