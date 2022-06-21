package co.com.sofka.cliente.commands;

import co.com.sofka.cliente.identities.ClienteId;
import co.com.sofka.cliente.identities.CuentaId;
import co.com.sofka.cliente.values.Email;
import co.com.sofka.cliente.values.Nombre;
import co.com.sofka.cliente.values.Rol;
import co.com.sofka.cliente.values.Telefono;
import co.com.sofka.domain.generic.Command;

public class CrearCliente extends Command {

    private final ClienteId clienteId;
    private final Nombre nombre;
    private final Telefono telefono;
    private final CuentaId cuentaId;
    private final Email email;
    private final Rol rol;

    public CrearCliente(ClienteId clienteId, Nombre nombre, Telefono telefono, CuentaId cuentaId, Email email, Rol rol) {

        this.clienteId = clienteId;
        this.nombre = nombre;
        this.telefono = telefono;
        this.cuentaId = cuentaId;
        this.email = email;
        this.rol = rol;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public CuentaId getCuentaId() {
        return cuentaId;
    }

    public Email getEmail() {
        return email;
    }

    public Rol getRol() {
        return rol;
    }
}
