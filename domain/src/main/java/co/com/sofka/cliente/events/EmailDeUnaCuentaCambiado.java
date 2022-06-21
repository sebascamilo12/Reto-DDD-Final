package co.com.sofka.cliente.events;

import co.com.sofka.cliente.Cuenta;
import co.com.sofka.cliente.identities.CuentaId;
import co.com.sofka.cliente.values.Email;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.Objects;

public class EmailDeUnaCuentaCambiado extends DomainEvent {
    private final CuentaId cuentaId;
    private final Email email;

    public EmailDeUnaCuentaCambiado(CuentaId cuentaId, Email email) {
        super("sofka.cliente.emaildeunacuentacambiado");
        Objects.requireNonNull(cuentaId);
        Objects.requireNonNull(email);
        this.cuentaId = cuentaId;
        this.email = email;
    }



    public CuentaId getCuentaId() {
        return cuentaId;
    }

    public Email getEmail() {
        return email;
    }
}
