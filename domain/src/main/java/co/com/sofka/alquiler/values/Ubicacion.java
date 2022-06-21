package co.com.sofka.alquiler.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Ubicacion implements ValueObject<String> {

    private final String ubicacion;

    public Ubicacion(String ubicacion) {
        this.ubicacion = Objects.requireNonNull(ubicacion);
        if (this.ubicacion.isBlank()) {
            throw new IllegalArgumentException("Se debe ingresar una ubicacion");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ubicacion ubicacion1 = (Ubicacion) o;
        return ubicacion.equals(ubicacion1.ubicacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ubicacion);
    }

    @Override
    public String value() {
        return ubicacion;
    }
}
