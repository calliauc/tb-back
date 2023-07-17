package org.acme.models;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.List;

@Entity
public class Equipe extends PanacheEntity {

    public String name;
    public Boolean isTemporaire;
    public Boolean isActive;
    @ManyToOne
    @JoinColumn(name = "equipe_reference_id")
    public Equipe equipeReference;


}
