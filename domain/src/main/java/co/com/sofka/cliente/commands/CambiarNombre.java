package co.com.sofka.cliente.commands;

import co.com.sofka.cliente.identities.ClienteId;
import co.com.sofka.cliente.values.Nombre;
import co.com.sofka.domain.generic.Command;

public class CambiarNombre extends Command {

    private final ClienteId clienteId;
    private final Nombre nombre;

    public CambiarNombre(ClienteId clienteId, Nombre nombre) {
        this.clienteId = clienteId;
        this.nombre = nombre;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
