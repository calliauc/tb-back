package org.acme.models;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Equipe_Match")
public class EquipeMatch extends PanacheEntity {

    public String name;
}
