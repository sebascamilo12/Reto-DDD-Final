package co.com.sofka.cliente.identities;

import co.com.sofka.domain.generic.Identity;

public class HistorialId extends Identity {
    public HistorialId() {}
    private HistorialId(String id) {
        super(id);
    }

    public static HistorialId of(String id) {
        return new HistorialId(id);
    }
}
