package co.com.sofka.cliente;

import co.com.sofka.alquiler.Alquiler;
import co.com.sofka.alquiler.identities.AlquilerId;
import co.com.sofka.cliente.events.*;
import co.com.sofka.cliente.identities.ClienteId;
import co.com.sofka.cliente.identities.CuentaId;
import co.com.sofka.cliente.identities.FuncionId;
import co.com.sofka.cliente.identities.HistorialId;
import co.com.sofka.cliente.values.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Cliente extends AggregateEvent<ClienteId> {

    protected Nombre nombre;

    protected Cuenta cuenta;

    protected Historial historial;
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
        subscribe(new ClienteChange(this));
        appendChange(new ClienteCreado(nombre, telefono, cuentaId, email, rol)).apply();

    }

    private Cliente(ClienteId entityId) {
        super(entityId);
        subscribe(new ClienteChange(this));

    }

    public static Cliente from(ClienteId clienteId, List<DomainEvent> events){
        var cliente = new Cliente(clienteId);
        events.forEach(cliente::applyEvent);
        return cliente;
    }

    public void cambiarNombre(Nombre nombre) {
        Objects.requireNonNull(nombre);
        appendChange(new NombreCambiado(nombre)).apply();

    }

    public void cambiarTelefono(Telefono telefono) {
        Objects.requireNonNull(telefono);
        appendChange(new TelefonoCambiado(telefono)).apply();
    }

    public void cambiarEmailDeUnaCuenta(CuentaId cuentaId, Email email) {
        Objects.requireNonNull(cuentaId);
        Objects.requireNonNull(email);
        appendChange(new EmailDeUnaCuentaCambiado(cuentaId, email)).apply();
    }

    public void cambiarRolDeUnaCuenta(CuentaId cuentaId, Rol rol) {
        Objects.requireNonNull(cuentaId);
        Objects.requireNonNull(rol);
        appendChange(new RolDeUnaCuentaCambiado(cuentaId, rol)).apply();
    }

    public void agregarCuenta(CuentaId cuentaId) {
        appendChange(new CuentaAgregada(cuentaId)).apply();
    }

    public void agregarFuncion(FuncionId funcionId, Caracteristica caracteristica, Descripcion descripcion) {
        Objects.requireNonNull(funcionId);
        Objects.requireNonNull(caracteristica);
        Objects.requireNonNull(descripcion);
        appendChange(new FuncionAgregada(funcionId, caracteristica, descripcion)).apply();
    }

    public void asociarAlquiler(AlquilerId alquilerId) {
        Objects.requireNonNull(alquilerId);
        appendChange(new AlquilerAsociado(alquilerId)).apply();
    }

    public void cambiarDescripcionDeUnaFuncion(FuncionId funcionId, Descripcion descripcion) {
        Objects.requireNonNull(funcionId);
        Objects.requireNonNull(descripcion);
        appendChange(new DescripcionDeUnaFuncionCambiada(funcionId, descripcion)).apply();
    }

    public void cambiarCaracteristicaDeUnaFuncion(FuncionId funcionId, Caracteristica caracteristica) {
        Objects.requireNonNull((funcionId));
        Objects.requireNonNull(caracteristica);
        appendChange(new CaracteristicaDeUnaFuncionCambiada(funcionId, caracteristica)).apply();
    }

    public void cambiarCantidadDeHistorial(HistorialId historialId, Cantidad cantidad) {
        Objects.requireNonNull(historialId);
        Objects.requireNonNull(cantidad);
        appendChange((new CantidadDeHistorialCambiada(historialId, cantidad)));

    }

    public Optional<Funcion> getFuncionPorId(FuncionId funcionId) {
        return funciones().stream()
                .filter(funcion -> funcion.identity()
                        .equals(funcionId))
                .findFirst();
    }

    public Nombre nombre() {
        return nombre;
    }

    public Telefono telefono() {
        return telefono;
    }

    public Email email() {
        return email;
    }

    public Rol rol() {
        return rol;
    }

    public Set<Funcion> funciones() {
        return funciones;
    }
}
