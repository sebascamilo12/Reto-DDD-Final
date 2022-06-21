package co.com.sofka.alquiler;

import co.com.sofka.alquiler.identities.SalaId;
import co.com.sofka.alquiler.values.Estado;
import co.com.sofka.alquiler.values.Ubicacion;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Sala extends Entity<SalaId> {

    private Estado estado;
    private Ubicacion ubicacion;

    public Sala(SalaId entityId, Estado estado, Ubicacion ubicacion) {
        super(entityId);
        this.estado = estado;
        this.ubicacion = ubicacion;
    }

    public void actualizarEstado(Estado estado) {
        Objects.requireNonNull(estado);
    }

    public void actualizarUbicacion(Ubicacion ubicacion){
        Objects.requireNonNull(ubicacion);
    }

    public Estado estado() {
        return estado;
    }

    public Ubicacion ubicacion() {
        return ubicacion;
    }
}
