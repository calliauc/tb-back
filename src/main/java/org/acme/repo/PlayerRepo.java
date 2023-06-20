package org.acme.repo;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.acme.models.Player;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@ApplicationScoped
public class PlayerRepo implements PanacheRepository<Player> {
    public List<Player> findBy(Player player){
        Set<Player> playerSet = new HashSet<>();
        playerSet.addAll(Player.find("name", player.name).list());
        playerSet.addAll(Player.find("pseudo", player.pseudo).list());
        if (playerSet.isEmpty())
            return Player.listAll();
        return playerSet.stream().toList();
    }

    public List<Player> findByV2(Player player){
        String name = Objects.isNull(player.name)?"":player.name.toLowerCase();
        String pseudo = Objects.isNull(player.pseudo)?"":player.pseudo.toLowerCase();

        List<Player> listPlayers = Player.findAll().list();
        return listPlayers.stream()
                .filter(p -> p.name.toLowerCase().equals(name) || p.pseudo.toLowerCase().equals(pseudo))
                .toList();

    }
}
