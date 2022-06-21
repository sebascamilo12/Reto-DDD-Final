package co.com.sofka.cliente.events;

import co.com.sofka.cliente.identities.FuncionId;
import co.com.sofka.cliente.values.Caracteristica;
import co.com.sofka.cliente.values.Descripcion;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.Objects;

public class FuncionAgregada extends DomainEvent {
    private final FuncionId funcionId;
    private final Caracteristica caracteristica;
    private final Descripcion descripcion;

    public FuncionAgregada(FuncionId funcionId, Caracteristica caracteristica, Descripcion descripcion) {
        super("sofka.cliente.funcionagregada");
        Objects.requireNonNull(funcionId);
        Objects.requireNonNull(caracteristica);
        Objects.requireNonNull(descripcion);
        this.funcionId = funcionId;
        this.caracteristica = caracteristica;
        this.descripcion = descripcion;
    }

    public FuncionId getFuncionId() {
        return funcionId;
    }

    public Caracteristica getCaracteristica() {
        return caracteristica;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
