package co.com.sofka.cliente.commands;

import co.com.sofka.cliente.identities.ClienteId;
import co.com.sofka.cliente.identities.HistorialId;
import co.com.sofka.cliente.values.Cantidad;
import co.com.sofka.domain.generic.Command;

public class CambiarCantidadDeHistorial extends Command {

    private final ClienteId clienteId;
    private final HistorialId historialId;
    private final Cantidad cantidad;

    public CambiarCantidadDeHistorial(ClienteId clienteId, HistorialId historialId, Cantidad cantidad) {
        this.clienteId = clienteId;
        this.historialId = historialId;
        this.cantidad = cantidad;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public HistorialId getHistorialId() {
        return historialId;
    }

    public Cantidad getCantidad() {
        return cantidad;
    }
}
