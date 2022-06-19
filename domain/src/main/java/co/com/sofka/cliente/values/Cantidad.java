package co.com.sofka.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Cantidad implements ValueObject<Integer> {
    private final Integer cantidad;

    public Cantidad(int cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad no debe ser menor a cero");
        }
        this.cantidad = cantidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cantidad cantidad1 = (Cantidad) o;
        return cantidad.equals(cantidad1.cantidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cantidad);
    }

    @Override
    public Integer value() {
        return cantidad;
    }
}
