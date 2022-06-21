package co.com.sofka.registro.identities;

import co.com.sofka.domain.generic.Identity;

public class RegistroId extends Identity {
    public RegistroId() {}
    private RegistroId(String id) {
        super(id);
    }

    public static RegistroId of(String id) {
        return new RegistroId(id);
    }
}
