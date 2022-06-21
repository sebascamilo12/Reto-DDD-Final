package co.com.sofka.cliente.commands;

import co.com.sofka.alquiler.identities.AlquilerId;
import co.com.sofka.cliente.identities.ClienteId;
import co.com.sofka.domain.generic.Command;

public class AsociarAlquiler extends Command {

    private final ClienteId clienteId;
    private final AlquilerId alquilerId;

    public AsociarAlquiler(ClienteId clienteId, AlquilerId alquilerId) {
        this.clienteId = clienteId;
        this.alquilerId = alquilerId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public AlquilerId getAlquilerId() {
        return alquilerId;
    }
}
