package co.com.sofka.alquiler.events;

import co.com.sofka.alquiler.identities.LibroId;
import co.com.sofka.alquiler.identities.PrestamoId;
import co.com.sofka.alquiler.values.Codigo;
import co.com.sofka.alquiler.values.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class AlquilerCreado extends DomainEvent {
    private final PrestamoId prestamoId;
    private final Codigo codigo;
    private final LibroId libroId;
    private final Nombre nombre;

    public AlquilerCreado(PrestamoId prestamoId, Codigo codigo, LibroId libroId, Nombre nombre) {
        super("sofka.alquiler.alquilercreado");
        this.prestamoId = prestamoId;
        this.codigo = codigo;
        this.libroId = libroId;
        this.nombre = nombre;
    }

    public PrestamoId getPrestamoId() {
        return prestamoId;
    }

    public Codigo getCodigo() {
        return codigo;
    }

    public LibroId getLibroId() {
        return libroId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
