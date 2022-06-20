package co.com.sofka.registro.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.registro.identities.SalidaId;
import co.com.sofka.registro.values.FechaSalida;

public class FechaSalidaCambiada extends DomainEvent {

    private final SalidaId salidaId;
    private final FechaSalida fechaSalida;

    public FechaSalidaCambiada(SalidaId salidaId, FechaSalida fechaSalida) {
        super("sofka.registro.fechasalidacambiada");
        this.salidaId = salidaId;
        this.fechaSalida = fechaSalida;
    }

    public SalidaId getSalidaId() {
        return salidaId;
    }

    public FechaSalida getFechaSalida() {
        return fechaSalida;
    }
}
