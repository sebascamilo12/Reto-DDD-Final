package co.com.sofka.cliente;

import co.com.sofka.cliente.identities.CuentaId;
import co.com.sofka.cliente.values.Email;
import co.com.sofka.cliente.values.Rol;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Cuenta extends Entity<CuentaId> {

    private final Email email;
    private final Rol rol;

    public Cuenta(CuentaId entityId, Email email, Rol rol) {
        super(entityId);
        this.email = email;
        this.rol = rol;
    }

    public void actualizarRol(Rol rol) {
        Objects.requireNonNull(rol);
    }

    public void actualizarEmail(Email email){
        Objects.requireNonNull(email);
    }

    public Email email() {
        return email;
    }

    public Rol rol() {
        return rol;
    }
}
