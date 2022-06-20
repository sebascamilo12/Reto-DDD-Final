package co.com.sofka.cliente.events;

import co.com.sofka.cliente.identities.CuentaId;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.Objects;

public class CuentaAgregada extends DomainEvent {
    private final CuentaId cuentaId;

    public CuentaAgregada(CuentaId cuentaId) {
        super("sofka.cliente.cuentaagregada");
        Objects.requireNonNull(cuentaId);
        this.cuentaId = cuentaId;
    }

    public CuentaId getCuentaId() {
        return cuentaId;
    }
}
