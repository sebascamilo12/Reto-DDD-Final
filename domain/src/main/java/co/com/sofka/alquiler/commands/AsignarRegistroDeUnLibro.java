package co.com.sofka.alquiler.commands;

import co.com.sofka.alquiler.identities.AlquilerId;
import co.com.sofka.alquiler.identities.LibroId;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.registro.identities.RegistroId;

public class AsignarRegistroDeUnLibro extends Command {

    private final AlquilerId alquilerId;
    private final LibroId libroId;
    private final RegistroId registroId;

    public AsignarRegistroDeUnLibro(AlquilerId alquilerId, LibroId libroId, RegistroId registroId) {
        this.alquilerId = alquilerId;
        this.libroId = libroId;
        this.registroId = registroId;
    }

    public AlquilerId getAlquilerId() {
        return alquilerId;
    }

    public LibroId getLibroId() {
        return libroId;
    }

    public RegistroId getRegistroId() {
        return registroId;
    }
}
