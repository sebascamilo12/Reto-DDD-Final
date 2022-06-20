package co.com.sofka.alquiler.events;

import co.com.sofka.alquiler.identities.LibroId;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.registro.identities.RegistroId;

public class RegistroDeUnLibroAsignado extends DomainEvent {
    private final LibroId libroId;
    private final RegistroId registroId;

    public RegistroDeUnLibroAsignado(LibroId libroId, RegistroId registroId) {
        super("sofka.alquiler.registrodeunlibroasignado");
        this.libroId = libroId;
        this.registroId = registroId;
    }

    public LibroId getLibroId() {
        return libroId;
    }

    public RegistroId getRegistroId() {
        return registroId;
    }
}
