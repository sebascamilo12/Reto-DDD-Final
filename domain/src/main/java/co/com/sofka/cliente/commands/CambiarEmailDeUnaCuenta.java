package co.com.sofka.cliente.commands;

import co.com.sofka.cliente.identities.ClienteId;
import co.com.sofka.cliente.identities.CuentaId;
import co.com.sofka.cliente.values.Email;
import co.com.sofka.domain.generic.Command;

public class CambiarEmailDeUnaCuenta extends Command {

    private final ClienteId clienteId;
    private final CuentaId cuentaId;
    private final Email email;

    public CambiarEmailDeUnaCuenta(ClienteId clienteId, CuentaId cuentaId, Email email) {
        this.clienteId = clienteId;
        this.cuentaId = cuentaId;
        this.email = email;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public CuentaId getCuentaId() {
        return cuentaId;
    }

    public Email getEmail() {
        return email;
    }
}
