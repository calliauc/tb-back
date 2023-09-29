package org.acme.models;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class But extends PanacheEntity {
    @ManyToOne
    @JoinColumn(name = "joueur_id")
    public Joueur joueur;
    @ManyToOne
    @JoinColumn(name = "match_id")
    public Match match;
    public TiersTemps tiersTemps;
    public String timer;
    public float score;

}
