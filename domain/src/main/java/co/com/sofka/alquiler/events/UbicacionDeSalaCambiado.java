package co.com.sofka.alquiler.events;

import co.com.sofka.alquiler.identities.SalaId;
import co.com.sofka.alquiler.values.Ubicacion;
import co.com.sofka.domain.generic.DomainEvent;

public class UbicacionDeSalaCambiado extends DomainEvent {
    private final SalaId salaId;
    private final Ubicacion ubicacion;

    public UbicacionDeSalaCambiado(SalaId salaId, Ubicacion ubicacion) {
        super("sofka.alquiler.ubicaciondesalacambiado");
        this.salaId = salaId;
        this.ubicacion = ubicacion;
    }

    public SalaId getSalaId() {
        return salaId;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }
}
