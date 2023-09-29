package org.acme.models;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "classe_joueur")
public class ClasseJoueur extends PanacheEntity {

    @ManyToOne
    @JoinColumn(name = "classe_id")
    public Classe classe;
    @ManyToOne
    @JoinColumn(name = "joueur_id")
    public Joueur joueur;
    @ManyToOne
    @JoinColumn(name = "match_id")
    public Match match;
    public TiersTemps tiersTemps;

}
