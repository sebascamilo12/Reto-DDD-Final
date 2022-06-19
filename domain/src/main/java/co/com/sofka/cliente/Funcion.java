package co.com.sofka.cliente;

import co.com.sofka.cliente.identities.FuncionId;
import co.com.sofka.cliente.values.Caracteristica;
import co.com.sofka.cliente.values.Descripcion;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Funcion extends Entity<FuncionId> {
    private final Descripcion descripcion;
    private final Caracteristica caracteristica;

    public Funcion(FuncionId entityId, Descripcion descripcion, Caracteristica caracteristica) {
        super(entityId);
        this.descripcion = descripcion;
        this.caracteristica = caracteristica;
    }

    public void actualizarDescripcion(Descripcion descripcion){
        Objects.requireNonNull(descripcion);
    }

    public void actualizarCaracteristica(Caracteristica caracteristica){
        Objects.requireNonNull(caracteristica);
    }
    public Descripcion descripcion() {
        return descripcion;
    }

    public Caracteristica caracteristica() {
        return caracteristica;
    }
}
