package org.acme.repo;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.acme.models.Classe;

@ApplicationScoped
public class ClasseRepo implements PanacheRepository<Classe> {

}
