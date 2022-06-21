package co.com.sofka.cliente.commands;

import co.com.sofka.cliente.identities.ClienteId;
import co.com.sofka.cliente.identities.CuentaId;
import co.com.sofka.domain.generic.Command;

public class AgregarCuenta extends Command {

    private final ClienteId clienteId;
    private final CuentaId cuentaId;

    public AgregarCuenta(ClienteId clienteId, CuentaId cuentaId) {
        this.clienteId = clienteId;
        this.cuentaId = cuentaId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public CuentaId getCuentaId() {
        return cuentaId;
    }
}
