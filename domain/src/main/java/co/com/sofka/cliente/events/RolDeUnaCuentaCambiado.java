package co.com.sofka.cliente.events;

import co.com.sofka.cliente.identities.CuentaId;
import co.com.sofka.cliente.values.Rol;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.Objects;

public class RolDeUnaCuentaCambiado extends DomainEvent {


    private final CuentaId cuentaId;
    private final Rol rol;

    public RolDeUnaCuentaCambiado(CuentaId cuentaId, Rol rol) {
        super("sofka.cliente.roldeunacuentacambiado");
        Objects.requireNonNull(cuentaId);
        Objects.requireNonNull(rol);
        this.cuentaId = cuentaId;
        this.rol = rol;
    }

    public CuentaId getCuentaId() {
        return cuentaId;
    }

    public Rol getRol() {
        return rol;
    }
}
