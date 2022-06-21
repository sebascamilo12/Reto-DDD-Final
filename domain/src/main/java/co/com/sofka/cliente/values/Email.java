package co.com.sofka.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Email implements ValueObject<String> {

    private final String email;

    public Email(String email) {
        this.email = Objects.requireNonNull(email);
        if (this.email.isBlank()) {
            throw new IllegalArgumentException("Se debe ingresar un correo");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Email email1 = (Email) o;
        return email.equals(email1.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

    @Override
    public String value() {
        return email;
    }
}
