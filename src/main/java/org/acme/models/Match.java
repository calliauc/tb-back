package org.acme.models;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;

@Entity
public class Match extends PanacheEntity {

    public LocalDate date;

    @ManyToOne
    @JoinColumn(name = "equipe_a_id")
    public Equipe equipeA;
    @ManyToOne
    @JoinColumn(name = "equipe_b_id")
    public Equipe equipeB;

}
