package org.acme.models;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class Joueur extends PanacheEntity {

    public String name;
    public String pseudo;
}
