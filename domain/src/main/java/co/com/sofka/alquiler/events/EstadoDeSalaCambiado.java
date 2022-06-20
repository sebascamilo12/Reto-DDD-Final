package co.com.sofka.alquiler.events;

import co.com.sofka.alquiler.identities.SalaId;
import co.com.sofka.alquiler.values.Estado;
import co.com.sofka.domain.generic.DomainEvent;

public class EstadoDeSalaCambiado extends DomainEvent {
    private final SalaId salaId;
    private final Estado estado;

    public EstadoDeSalaCambiado(SalaId salaId, Estado estado) {
        super("sofka.alquiler.estadodesalacambiado");
        this.salaId = salaId;
        this.estado = estado;
    }

    public SalaId getSalaId() {
        return salaId;
    }

    public Estado getEstado() {
        return estado;
    }
}
