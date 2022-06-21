package co.com.sofka.alquiler.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;
import java.util.Set;

public class Estado implements ValueObject<Estado.Estados> {

    private final Estados estado;

    public enum Estados {
        LIBRE, OCUPADO
    }

    public Estado(Estados estado) {

        this.estado = Objects.requireNonNull(estado,"Se requiere un estado");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estado estado1 = (Estado) o;
        return estado == estado1.estado;
    }

    @Override
    public int hashCode() {
        return Objects.hash(estado);
    }

    @Override
    public Estado.Estados value() {
        return estado;
    }


}
