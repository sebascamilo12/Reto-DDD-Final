package co.com.sofka.cliente.identities;

import co.com.sofka.domain.generic.Identity;

public class CuentaId extends Identity {
    public CuentaId() {}
    private CuentaId(String id) {
        super(id);
    }

    public static CuentaId of(String id) {
        return new CuentaId(id);
    }
}
