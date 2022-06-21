package co.com.sofka.registro.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class FechaSalida implements ValueObject<String> {

    private final LocalDate fecha;
    private final String formato;

    public FechaSalida(int dia, int mes, int ano) {
        try {
            fecha = LocalDate.of(ano, mes, dia);
            if (fecha.isAfter(LocalDate.now())) {
                throw new IllegalArgumentException("Fecha no valida");
            }
        } catch (DateTimeException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
        formato = generarFormato();
    }
    private String generarFormato(){
        return fecha.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FechaSalida that = (FechaSalida) o;
        return formato.equals(that.formato);
    }

    @Override
    public int hashCode() {
        return Objects.hash(formato);
    }

    @Override
    public String value() {
        return formato;
    }
}
