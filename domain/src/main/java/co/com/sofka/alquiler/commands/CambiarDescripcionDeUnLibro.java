package co.com.sofka.alquiler.commands;

import co.com.sofka.alquiler.identities.AlquilerId;
import co.com.sofka.alquiler.identities.LibroId;
import co.com.sofka.alquiler.values.Descripcion;
import co.com.sofka.domain.generic.Command;

public class CambiarDescripcionDeUnLibro extends Command {

    private final AlquilerId alquilerId;
    private final LibroId libroId;
    private final Descripcion descripcion;

    public CambiarDescripcionDeUnLibro(AlquilerId alquilerId, LibroId libroId, Descripcion descripcion) {
        this.alquilerId = alquilerId;
        this.libroId = libroId;
        this.descripcion = descripcion;
    }

    public AlquilerId getAlquilerId() {
        return alquilerId;
    }

    public LibroId getLibroId() {
        return libroId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
