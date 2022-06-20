package co.com.sofka.cliente.events;

import co.com.sofka.cliente.values.Telefono;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.Objects;

public class TelefonoCambiado extends DomainEvent {

    private final Telefono telefono;

    public TelefonoCambiado(Telefono telefono) {
        super("sofka.cliente.telefonocambiado");
        Objects.requireNonNull(telefono);
        this.telefono = telefono;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
