package co.com.sofka.cliente.events;

import co.com.sofka.alquiler.identities.AlquilerId;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.Objects;

public class AlquilerAsociado extends DomainEvent {

    private final AlquilerId alquilerId;

    public AlquilerAsociado(AlquilerId alquilerId) {
        super("sofka.cliente.alquilerasociado");
        Objects.requireNonNull(alquilerId);
        this.alquilerId = alquilerId;
    }

    public AlquilerId getAlquilerId() {
        return alquilerId;
    }
}
