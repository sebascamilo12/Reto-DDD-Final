package co.com.sofka.alquiler.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Categoria implements ValueObject<String> {

    private final String categoria;

    public Categoria(String categoria) {
        this.categoria = Objects.requireNonNull(categoria);
        if (this.categoria.isBlank()) {
            throw new IllegalArgumentException("Se debe tener una categoria");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria1 = (Categoria) o;
        return categoria.equals(categoria1.categoria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoria);
    }

    @Override
    public String value() {
        return categoria;
    }
}
