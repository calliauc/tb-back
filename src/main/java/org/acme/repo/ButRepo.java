package org.acme.repo;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.acme.models.But;

@ApplicationScoped
public class ButRepo implements PanacheRepository<But> {

}
