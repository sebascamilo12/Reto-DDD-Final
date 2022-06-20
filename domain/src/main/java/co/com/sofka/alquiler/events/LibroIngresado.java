package co.com.sofka.alquiler.events;

import co.com.sofka.alquiler.identities.AlquilerId;
import co.com.sofka.alquiler.identities.LibroId;
import co.com.sofka.alquiler.identities.PrestamoId;
import co.com.sofka.domain.generic.DomainEvent;

public class LibroIngresado extends DomainEvent {
    private final AlquilerId alquilerId;
    private final LibroId libroId;
    private final PrestamoId prestamoId;

    public LibroIngresado(AlquilerId alquilerId, LibroId libroId, PrestamoId prestamoId) {
        super("sofka.alquiler.libroingresado");
        this.alquilerId = alquilerId;
        this.libroId = libroId;
        this.prestamoId = prestamoId;
    }

    public AlquilerId getAlquilerId() {
        return alquilerId;
    }

    public LibroId getLibroId() {
        return libroId;
    }

    public PrestamoId getPrestamoId() {
        return prestamoId;
    }
}
