package co.com.sofka.alquiler.identities;

import co.com.sofka.domain.generic.Identity;

public class AlquilerId extends Identity {
    public AlquilerId() {}
    private AlquilerId(String id) {
        super(id);
    }

    public static AlquilerId of(String id) {
        return new AlquilerId(id);
    }
}
