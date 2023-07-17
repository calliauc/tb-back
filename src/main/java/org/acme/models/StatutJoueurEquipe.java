package org.acme.models;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Joueur_Match")
public class StatutJoueurEquipe extends PanacheEntity {

    public String name;
}
