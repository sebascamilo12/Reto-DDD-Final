package co.com.sofka.alquiler;

import co.com.sofka.alquiler.identities.PrestamoId;
import co.com.sofka.alquiler.values.Codigo;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Prestamo extends Entity<PrestamoId> {
    private Codigo codigo;

    public Prestamo(PrestamoId entityId, Codigo codigo) {
        super(entityId);
        this.codigo = codigo;
    }

    public void actualizarCodigo(Codigo codigo){
        Objects.requireNonNull(codigo);
    }
    public Codigo codigo() {
        return codigo;
    }
}
