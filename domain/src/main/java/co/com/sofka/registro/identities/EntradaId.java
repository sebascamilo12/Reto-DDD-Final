package co.com.sofka.registro.identities;

import co.com.sofka.domain.generic.Identity;

public class EntradaId extends Identity {
    public EntradaId() {}
    private EntradaId(String id) {
        super(id);
    }

    public static EntradaId of(String id) {
        return new EntradaId(id);
    }
}
