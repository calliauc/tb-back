package org.acme.models;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class JoueurEquipe extends PanacheEntity {

    @ManyToOne
    @JoinColumn(name = "joueur_id")
    public Joueur joueur;

    @ManyToOne
    @JoinColumn(name = "equipe_id")
    public Equipe equipe;

    @ManyToOne
    @JoinColumn(name = "statut_id")
    public StatutJoueurEquipe statut;

}
