package co.com.sofka.registro.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.registro.identities.EntradaId;
import co.com.sofka.registro.identities.RegistroId;
import co.com.sofka.registro.values.FechaEntrada;

public class CambiarFechaEntrada extends Command {
    private final RegistroId registroId;
    private final EntradaId entradaId;
    private final FechaEntrada fechaEntrada;

    public CambiarFechaEntrada(RegistroId registroId, EntradaId entradaId, FechaEntrada fechaEntrada) {
        this.registroId = registroId;
        this.entradaId = entradaId;
        this.fechaEntrada = fechaEntrada;
    }

    public RegistroId getRegistroId() {
        return registroId;
    }

    public EntradaId getEntradaId() {
        return entradaId;
    }

    public FechaEntrada getFechaEntrada() {
        return fechaEntrada;
    }
}
