package co.com.sofka.alquiler.events;

import co.com.sofka.alquiler.identities.LibroId;
import co.com.sofka.alquiler.values.Descripcion;
import co.com.sofka.domain.generic.DomainEvent;

public class DescripcionDeUnLibroCambiado extends DomainEvent {
    private final LibroId libroId;
    private final Descripcion descripcion;

    public DescripcionDeUnLibroCambiado(LibroId libroId, Descripcion descripcion) {
        super("sofka.alquiler.descripciondeunlibrocambiado");
        this.libroId = libroId;
        this.descripcion = descripcion;
    }

    public LibroId getLibroId() {
        return libroId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
