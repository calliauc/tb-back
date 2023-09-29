package org.acme.models;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "joueur_match")
public class JoueurMatch extends PanacheEntity {

    @ManyToOne
    @JoinColumn(name = "joueur_id")
    public Joueur joueur;
    @ManyToOne
    @JoinColumn(name = "match_id")
    public Match match;
//    public List<But> buts;

    public String nomAffichage;
}
