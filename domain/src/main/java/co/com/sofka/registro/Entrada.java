package co.com.sofka.registro;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.registro.identities.EntradaId;
import co.com.sofka.registro.values.FechaEntrada;

import java.util.Objects;

public class Entrada extends Entity<EntradaId> {
    private FechaEntrada fechaEntrada;

    public Entrada(EntradaId entityId, FechaEntrada fechaEntrada) {
        super(entityId);
        this.fechaEntrada = fechaEntrada;
    }

    public void actualizarFechaEntrada(FechaEntrada fechaEntrada){
        Objects.requireNonNull(fechaEntrada);
    }

    public FechaEntrada fechaEntrada() {
        return fechaEntrada;
    }
}
