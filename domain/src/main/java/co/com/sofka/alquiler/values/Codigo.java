package co.com.sofka.alquiler.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Codigo implements ValueObject<String> {

    private final String codigo;

    public Codigo(String codigo) {
        this.codigo = Objects.requireNonNull(codigo);
        if (this.codigo.isBlank()) {
            throw new IllegalArgumentException("Se debe tener un codigo");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Codigo codigo1 = (Codigo) o;
        return codigo.equals(codigo1.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public String value() {
        return codigo;
    }
}
