package co.com.sofka.cliente.commands;

import co.com.sofka.cliente.identities.ClienteId;
import co.com.sofka.cliente.values.Telefono;
import co.com.sofka.domain.generic.Command;

public class CambiarTelefono extends Command {

    private final ClienteId clienteId;
    private final Telefono telefono;

    public CambiarTelefono(ClienteId clienteId, Telefono telefono) {
        this.clienteId = clienteId;
        this.telefono = telefono;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
