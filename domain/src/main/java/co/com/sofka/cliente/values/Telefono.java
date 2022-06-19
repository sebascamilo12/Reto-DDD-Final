package co.com.sofka.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Telefono implements ValueObject<String> {

    private final String telefono;

    public Telefono(String telefono) {
        this.telefono = Objects.requireNonNull(telefono);
        if (this.telefono.isBlank()) {
            throw new IllegalArgumentException("Se requiere un numero de telefono");

        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telefono telefono1 = (Telefono) o;
        return telefono.equals(telefono1.telefono);
    }

    @Override
    public int hashCode() {
        return Objects.hash(telefono);
    }

    @Override
    public String value() {
        return telefono;
    }
}
