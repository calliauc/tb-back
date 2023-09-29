package org.acme.repo;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.acme.models.ClasseJoueur;

@ApplicationScoped
public class ClasseJoueurRepo implements PanacheRepository<ClasseJoueur> {

}
