package co.com.sofka.registro;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.registro.identities.SalidaId;
import co.com.sofka.registro.values.FechaSalida;

import java.util.Objects;

public class Salida extends Entity<SalidaId> {
    private FechaSalida fechaSalida;

    public Salida(SalidaId entityId, FechaSalida fechaSalida) {
        super(entityId);
        this.fechaSalida = fechaSalida;
    }

    public void actualizarFechaSalida(FechaSalida fechaSalida){
        Objects.requireNonNull(fechaSalida);
    }
    public FechaSalida fechaSalida() {
        return fechaSalida;
    }
}
