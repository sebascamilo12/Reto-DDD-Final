package co.com.sofka.alquiler.commands;

import co.com.sofka.alquiler.identities.AlquilerId;
import co.com.sofka.alquiler.identities.LibroId;
import co.com.sofka.alquiler.values.Categoria;
import co.com.sofka.domain.generic.Command;

public class CambiarCategoriaDeUnLibro extends Command {

    private final AlquilerId alquilerId;
    private final LibroId libroId;
    private final Categoria categoria;

    public CambiarCategoriaDeUnLibro(AlquilerId alquilerId, LibroId libroId, Categoria categoria) {

        this.alquilerId = alquilerId;
        this.libroId = libroId;
        this.categoria = categoria;
    }

    public AlquilerId getAlquilerId() {
        return alquilerId;
    }

    public LibroId getLibroId() {
        return libroId;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}
