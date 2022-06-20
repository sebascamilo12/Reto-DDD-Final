package co.com.sofka.alquiler;

import co.com.sofka.alquiler.events.*;
import co.com.sofka.alquiler.identities.AlquilerId;
import co.com.sofka.alquiler.identities.LibroId;
import co.com.sofka.alquiler.identities.PrestamoId;
import co.com.sofka.alquiler.identities.SalaId;
import co.com.sofka.alquiler.values.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.registro.identities.RegistroId;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Alquiler extends AggregateEvent<AlquilerId> {
    protected PrestamoId prestamoId;
    protected Codigo codigo;
    protected LibroId libroId;

    protected Nombre nombre;
    protected Sala sala;

    protected Libro libro;

    protected Prestamo prestamo;


    public Alquiler(AlquilerId entityId, PrestamoId prestamoId, Codigo codigo, LibroId libroId, Nombre nombre) {
        super(entityId);
        Objects.requireNonNull(prestamoId);
        Objects.requireNonNull(codigo);
        Objects.requireNonNull(libroId);
        Objects.requireNonNull(nombre);
        subscribe(new AlquilerChange(this));
        appendChange(new AlquilerCreado(prestamoId, codigo, libroId, nombre)).apply();

    }

    private Alquiler(AlquilerId entityId) {
        super(entityId);
        subscribe(new AlquilerChange(this));

    }

    public static Alquiler from(AlquilerId alquilerId, List<DomainEvent>events){
        var alquiler = new Alquiler(alquilerId);
        events.forEach(alquiler::applyEvent);
        return alquiler;
    }

    public void asignarCodigoDeUnPrestamo(PrestamoId prestamoId, Codigo codigo) {
        Objects.requireNonNull(prestamoId);
        Objects.requireNonNull(codigo);
        appendChange(new CodigoDeUnPrestamoAsignado(prestamoId, codigo)).apply();

    }

    public void cambiarEstadoDeSala(SalaId salaId, Estado estado) {
        Objects.requireNonNull(salaId);
        Objects.requireNonNull(estado);
        appendChange(new EstadoDeSalaCambiado(salaId, estado)).apply();
    }

    public void cambiarUbicacionDeSala(SalaId salaId, Ubicacion ubicacion) {
        Objects.requireNonNull(salaId);
        Objects.requireNonNull(ubicacion);
        appendChange(new UbicacionDeSalaCambiado(salaId, ubicacion)).apply();
    }

    public void darSalidaAUnLibro(AlquilerId alquilerId, LibroId libroId, PrestamoId prestamoId) {
        Objects.requireNonNull(alquilerId);
        Objects.requireNonNull(libroId);
        appendChange(new LibroDespachado(alquilerId, libroId, prestamoId)).apply();
    }

    public void darEntradaAUnLibro(AlquilerId alquilerId, LibroId libroId, PrestamoId prestamoId) {
        Objects.requireNonNull(alquilerId);
        Objects.requireNonNull(libroId);
        appendChange(new LibroIngresado(alquilerId, libroId, prestamoId)).apply();
    }

    public void cambiarCategoriaDeUnLibro(LibroId libroId, Categoria categoria) {
        Objects.requireNonNull(libroId);
        Objects.requireNonNull(categoria);
        appendChange(new CategoriaDeUnLibroCambiado(libroId, categoria)).apply();
    }

    public void cambiarDescripcionDeUnLibro(LibroId libroId, Descripcion descripcion) {
        Objects.requireNonNull(libroId);
        Objects.requireNonNull(descripcion);
        appendChange(new DescripcionDeUnLibroCambiado(libroId, descripcion)).apply();
    }

    public void cambiarCodigoDeUnPrestamo(PrestamoId prestamoId, Codigo codigo) {
        Objects.requireNonNull(prestamoId);
        Objects.requireNonNull(codigo);
        appendChange(new CodigoDeUnPrestamoCambiado(prestamoId, codigo)).apply();
    }

    public void asignarRegistroDeUnLibro(LibroId libroId, RegistroId registroId) {
        Objects.requireNonNull(libroId);
        Objects.requireNonNull(registroId);
        appendChange(new RegistroDeUnLibroAsignado(libroId, registroId)).apply();

    }

    public PrestamoId prestamoId() {
        return prestamoId;
    }

    public Codigo codigo() {
        return codigo;
    }

    public LibroId libroId() {
        return libroId;
    }

    public Nombre nombre() {
        return nombre;
    }

    public Sala sala() {
        return sala;
    }

    public Libro libro() {
        return libro;
    }

    public Prestamo prestamo() {
        return prestamo;
    }
}
