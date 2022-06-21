package co.com.sofka.registro.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.registro.identities.EntradaId;
import co.com.sofka.registro.values.FechaEntrada;

public class FechaEntradaCambiada extends DomainEvent {
    private final EntradaId entradaId;
    private final FechaEntrada fechaEntrada;

    public FechaEntradaCambiada(EntradaId entradaId, FechaEntrada fechaEntrada) {
        super("sofka.registro.fechaentradacambiada");
        this.entradaId = entradaId;
        this.fechaEntrada = fechaEntrada;
    }

    public EntradaId getEntradaId() {
        return entradaId;
    }

    public FechaEntrada getFechaEntrada() {
        return fechaEntrada;
    }
}
