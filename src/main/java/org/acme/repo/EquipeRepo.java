package org.acme.repo;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.acme.models.Equipe;

@ApplicationScoped
public class EquipeRepo implements PanacheRepository<Equipe> {

}
