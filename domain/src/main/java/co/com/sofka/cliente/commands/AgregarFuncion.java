package co.com.sofka.cliente.commands;

import co.com.sofka.cliente.identities.ClienteId;
import co.com.sofka.cliente.identities.FuncionId;
import co.com.sofka.cliente.values.Caracteristica;
import co.com.sofka.cliente.values.Descripcion;
import co.com.sofka.domain.generic.Command;

public class AgregarFuncion extends Command {

    private final ClienteId clienteId;
    private final FuncionId funcionId;
    private final Caracteristica caracteristica;
    private final Descripcion descripcion;

    public AgregarFuncion(ClienteId clienteId, FuncionId funcionId, Caracteristica caracteristica, Descripcion descripcion) {
        this.clienteId = clienteId;
        this.funcionId = funcionId;
        this.caracteristica = caracteristica;
        this.descripcion = descripcion;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public FuncionId getFuncionId() {
        return funcionId;
    }

    public Caracteristica getCaracteristica() {
        return caracteristica;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
