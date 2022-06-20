package co.com.sofka.alquiler.events;

import co.com.sofka.alquiler.identities.LibroId;
import co.com.sofka.alquiler.values.Categoria;
import co.com.sofka.domain.generic.DomainEvent;

public class CategoriaDeUnLibroCambiado extends DomainEvent {
    private final LibroId libroId;
    private final Categoria categoria;

    public CategoriaDeUnLibroCambiado(LibroId libroId, Categoria categoria) {
        super("sofka.alquiler.categoriadeunlibrocambiado");
        this.libroId = libroId;
        this.categoria = categoria;
    }

    public LibroId getLibroId() {
        return libroId;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}
