package org.acme.repo;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.acme.models.Match;

@ApplicationScoped
public class MatchRepo implements PanacheRepository<Match> {

}
