package co.com.sofka.registro.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.registro.identities.EntradaId;
import co.com.sofka.registro.identities.InventarioId;
import co.com.sofka.registro.identities.SalidaId;

public class RegistroCreado extends DomainEvent {
    private final InventarioId inventarioId;
    private final EntradaId entradaId;
    private final SalidaId salidaId;

    public RegistroCreado(InventarioId inventarioId, EntradaId entradaId, SalidaId salidaId) {
        super("sofka.registro.registrocreado");
        this.inventarioId = inventarioId;
        this.entradaId = entradaId;
        this.salidaId = salidaId;
    }

    public InventarioId getInventarioId() {
        return inventarioId;
    }

    public EntradaId getEntradaId() {
        return entradaId;
    }

    public SalidaId getSalidaId() {
        return salidaId;
    }
}
