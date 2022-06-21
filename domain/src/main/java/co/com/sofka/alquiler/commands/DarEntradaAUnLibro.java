package co.com.sofka.alquiler.commands;

import co.com.sofka.alquiler.identities.AlquilerId;
import co.com.sofka.alquiler.identities.LibroId;
import co.com.sofka.alquiler.identities.PrestamoId;
import co.com.sofka.domain.generic.Command;

public class DarEntradaAUnLibro extends Command {
    private final AlquilerId alquilerId;
    private final LibroId libroId;
    private final PrestamoId prestamoId;

    public DarEntradaAUnLibro(AlquilerId alquilerId, LibroId libroId, PrestamoId prestamoId) {
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
