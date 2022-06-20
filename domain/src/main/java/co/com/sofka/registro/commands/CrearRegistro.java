package co.com.sofka.registro.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.registro.identities.EntradaId;
import co.com.sofka.registro.identities.InventarioId;
import co.com.sofka.registro.identities.RegistroId;
import co.com.sofka.registro.identities.SalidaId;

public class CrearRegistro extends Command {

    private final RegistroId registroId;
    private final InventarioId inventarioId;
    private final EntradaId entradaId;
    private final SalidaId salidaId;

    public CrearRegistro(RegistroId registroId, InventarioId inventarioId, EntradaId entradaId, SalidaId salidaId) {
        this.registroId = registroId;
        this.inventarioId = inventarioId;
        this.entradaId = entradaId;
        this.salidaId = salidaId;
    }

    public RegistroId getRegistroId() {
        return registroId;
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
