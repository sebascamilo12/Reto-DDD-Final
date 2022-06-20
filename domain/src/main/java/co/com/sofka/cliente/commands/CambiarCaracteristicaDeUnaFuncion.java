package co.com.sofka.cliente.commands;

import co.com.sofka.cliente.identities.ClienteId;
import co.com.sofka.cliente.identities.FuncionId;
import co.com.sofka.cliente.values.Caracteristica;
import co.com.sofka.domain.generic.Command;

public class CambiarCaracteristicaDeUnaFuncion extends Command {

    private final ClienteId clienteId;
    private final FuncionId funcionId;
    private final Caracteristica caracteristica;

    public CambiarCaracteristicaDeUnaFuncion(ClienteId clienteId, FuncionId funcionId, Caracteristica caracteristica) {
        this.clienteId = clienteId;
        this.funcionId = funcionId;
        this.caracteristica = caracteristica;
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
}
