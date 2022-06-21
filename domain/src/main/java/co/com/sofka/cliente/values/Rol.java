package co.com.sofka.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Rol implements ValueObject<Rol.Roles> {

    public enum Roles {
        ESTUDIANTE, MAESTRO
    }

    private final Roles rol;


    public Rol(Roles rol) {

        this.rol = Objects.requireNonNull(rol, "Se requiere un rol");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rol rol1 = (Rol) o;
        return rol == rol1.rol;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rol);
    }

    @Override
    public Rol.Roles value() {
        return rol;
    }

}