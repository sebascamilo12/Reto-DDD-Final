package co.com.sofka.cliente.commands;

import co.com.sofka.cliente.identities.ClienteId;
import co.com.sofka.cliente.identities.FuncionId;
import co.com.sofka.cliente.values.Descripcion;
import co.com.sofka.domain.generic.Command;

public class CambiarDescripcionDeUnaFuncion extends Command {

    private final ClienteId clienteId;
    private final FuncionId funcionId;
    private final Descripcion descripcion;

    public CambiarDescripcionDeUnaFuncion(ClienteId clienteId, FuncionId funcionId, Descripcion descripcion) {
        this.clienteId = clienteId;
        this.funcionId = funcionId;
        this.descripcion = descripcion;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public FuncionId getFuncionId() {
        return funcionId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
