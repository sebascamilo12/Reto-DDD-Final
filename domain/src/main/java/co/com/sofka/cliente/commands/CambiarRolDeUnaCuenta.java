package co.com.sofka.cliente.commands;

import co.com.sofka.cliente.identities.ClienteId;
import co.com.sofka.cliente.identities.CuentaId;
import co.com.sofka.cliente.values.Rol;
import co.com.sofka.domain.generic.Command;

public class CambiarRolDeUnaCuenta extends Command {

    private final ClienteId clienteId;
    private final CuentaId cuentaId;
    private final Rol rol;

    public CambiarRolDeUnaCuenta(ClienteId clienteId, CuentaId cuentaId, Rol rol) {
        this.clienteId = clienteId;
        this.cuentaId = cuentaId;
        this.rol = rol;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public CuentaId getCuentaId() {
        return cuentaId;
    }

    public Rol getRol() {
        return rol;
    }
}
