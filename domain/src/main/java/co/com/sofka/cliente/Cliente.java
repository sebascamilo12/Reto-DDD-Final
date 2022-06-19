package co.com.sofka.cliente;

import co.com.sofka.cliente.events.ClienteCreado;
import co.com.sofka.cliente.events.NombreCambiado;
import co.com.sofka.cliente.identities.ClienteId;
import co.com.sofka.cliente.identities.CuentaId;
import co.com.sofka.cliente.values.Email;
import co.com.sofka.cliente.values.Nombre;
import co.com.sofka.cliente.values.Rol;
import co.com.sofka.cliente.values.Telefono;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Objects;
import java.util.Set;

public class Cliente extends AggregateEvent<ClienteId> {

    protected Nombre nombre;
    protected Telefono telefono;
    protected Email email;
    protected Rol rol;
    protected Set<Funcion> funciones;

    public Cliente(ClienteId entityId, Nombre nombre, Telefono telefono, CuentaId cuentaId, Email email, Rol rol) {
        super(entityId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(telefono);
        Objects.requireNonNull(cuentaId);
        Objects.requireNonNull(email);
        Objects.requireNonNull(rol);
        appendChange(new ClienteCreado(nombre, telefono, cuentaId, email, rol)).apply();

    }

    public void cambiarNombre(Nombre nombre){
        Objects.requireNonNull(nombre);
        appendChange(new NombreCambiado(nombre)).apply();

    }

}
