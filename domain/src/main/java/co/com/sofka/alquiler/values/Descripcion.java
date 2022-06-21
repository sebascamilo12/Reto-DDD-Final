package co.com.sofka.alquiler.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Descripcion implements ValueObject<String> {

    private final String descripcion;

    public Descripcion(String descripcion) {
        this.descripcion = Objects.requireNonNull(descripcion);
        if (this.descripcion.isBlank()) {
            throw new IllegalArgumentException("Se debe tener una descripcion");
        }
        if (this.descripcion.length() < 10) {
            throw new IllegalArgumentException("La descripcion debe tener como minimo 10 caracteres");
        }
        if (this.descripcion.length() > 100) {
            throw new IllegalArgumentException("La descripcion no debe superar los 100 caracteres");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Descripcion that = (Descripcion) o;
        return descripcion.equals(that.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descripcion);
    }

    @Override
    public String value() {
        return descripcion;
    }
}
