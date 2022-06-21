package co.com.sofka.cliente.events;

import co.com.sofka.cliente.identities.FuncionId;
import co.com.sofka.cliente.values.Descripcion;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.Objects;

public class DescripcionDeUnaFuncionCambiada extends DomainEvent {
    private final FuncionId funcionId;
    private final Descripcion descripcion;

    public DescripcionDeUnaFuncionCambiada(FuncionId funcionId, Descripcion descripcion) {
        super("sofka.clase.descripciondeunafuncioncambiada");
        Objects.requireNonNull(funcionId);
        Objects.requireNonNull(descripcion);
        this.funcionId = funcionId;
        this.descripcion = descripcion;
    }

    public FuncionId getFuncionId() {
        return funcionId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
