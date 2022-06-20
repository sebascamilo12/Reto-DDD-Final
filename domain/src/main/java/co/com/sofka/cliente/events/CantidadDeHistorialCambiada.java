package co.com.sofka.cliente.events;

import co.com.sofka.cliente.identities.HistorialId;
import co.com.sofka.cliente.values.Cantidad;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.Objects;

public class CantidadDeHistorialCambiada extends DomainEvent {
    private final HistorialId historialId;
    private final Cantidad cantidad;

    public CantidadDeHistorialCambiada(HistorialId historialId, Cantidad cantidad) {
        super("sofka.cliente.cantidaddehistorialcambiada");
        Objects.requireNonNull(historialId);
        Objects.requireNonNull(cantidad);
        this.historialId = historialId;
        this.cantidad = cantidad;
    }

    public HistorialId getHistorialId() {
        return historialId;
    }

    public Cantidad getCantidad() {
        return cantidad;
    }
}
