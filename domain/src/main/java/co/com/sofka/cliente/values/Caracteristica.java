package co.com.sofka.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Caracteristica implements ValueObject<String> {

    private final String caracteristica;

    public Caracteristica(String caracteristica) {
        this.caracteristica = Objects.requireNonNull(caracteristica);
        if (this.caracteristica.isBlank()) {
            throw new IllegalArgumentException("Se requiere una caracteristica");

        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Caracteristica that = (Caracteristica) o;
        return caracteristica.equals(that.caracteristica);
    }

    @Override
    public int hashCode() {
        return Objects.hash(caracteristica);
    }

    @Override
    public String value() {
        return caracteristica;
    }
}
