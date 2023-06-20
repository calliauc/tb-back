package org.acme;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Liveness;


@Liveness
@Entity
public class Episode extends PanacheEntity implements HealthCheck {

    public String title;
    public String description;


    @Override
    public HealthCheckResponse call() {
        return HealthCheckResponse.up("Probe 1");
    }
}
