package co.com.sofka.registro.identities;

import co.com.sofka.domain.generic.Identity;

public class SalidaId extends Identity {
    public SalidaId() {}
    private SalidaId(String id) {
        super(id);
    }

    public static SalidaId of(String id) {
        return new SalidaId(id);
    }
}
