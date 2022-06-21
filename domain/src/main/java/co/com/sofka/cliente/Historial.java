package co.com.sofka.cliente;

import co.com.sofka.cliente.identities.HistorialId;
import co.com.sofka.cliente.values.Cantidad;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Historial extends Entity<HistorialId> {

    private final Cantidad cantidad;

    public Historial(HistorialId entityId, Cantidad cantidad) {
        super(entityId);
        this.cantidad = cantidad;
    }

    public void actualizarCantidad(Cantidad cantidad){
        Objects.requireNonNull(cantidad);
    }

    public Cantidad cantidad() {
        return cantidad;
    }
}
