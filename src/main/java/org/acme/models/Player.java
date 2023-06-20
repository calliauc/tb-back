package org.acme.models;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class Player extends PanacheEntity {

    public String name;
    public String pseudo;
}
