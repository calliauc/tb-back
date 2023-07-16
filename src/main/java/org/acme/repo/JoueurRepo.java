package org.acme.repo;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.acme.models.Joueur;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@ApplicationScoped
public class JoueurRepo implements PanacheRepository<Joueur> {
    public List<Joueur> findBy(Joueur joueur){
        Set<Joueur> joueurSet = new HashSet<>();
        joueurSet.addAll(Joueur.find("name", joueur.name).list());
        joueurSet.addAll(Joueur.find("pseudo", joueur.pseudo).list());
        if (joueurSet.isEmpty())
            return Joueur.listAll();
        return joueurSet.stream().toList();
    }

    public List<Joueur> findByV2(Joueur joueur){
        String name = Objects.isNull(joueur.name)?"": joueur.name.toLowerCase();
        String pseudo = Objects.isNull(joueur.pseudo)?"": joueur.pseudo.toLowerCase();

        List<Joueur> listJoueurs = Joueur.findAll().list();
        return listJoueurs.stream()
                .filter(p -> p.name.toLowerCase().equals(name) || p.pseudo.toLowerCase().equals(pseudo))
                .toList();

    }
}
