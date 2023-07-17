package org.acme.models;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class But extends PanacheEntity {

    public String name;
    public String descriptionCourte;

}
