package co.com.sofka.registro.identities;

import co.com.sofka.domain.generic.Identity;

public class InventarioId extends Identity {
    public InventarioId() {}
    private InventarioId(String id) {
        super(id);
    }

    public static InventarioId of(String id) {
        return new InventarioId(id);
    }
}
