package co.com.sofka.registro.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.registro.identities.RegistroId;
import co.com.sofka.registro.identities.SalidaId;
import co.com.sofka.registro.values.FechaSalida;

public class CambiarFechaSalida extends Command {

    private final RegistroId registroId;
    private final SalidaId salidaId;
    private final FechaSalida fechaSalida;

    public CambiarFechaSalida(RegistroId registroId, SalidaId salidaId, FechaSalida fechaSalida) {
        this.registroId = registroId;
        this.salidaId = salidaId;
        this.fechaSalida = fechaSalida;
    }

    public RegistroId getRegistroId() {
        return registroId;
    }

    public SalidaId getSalidaId() {
        return salidaId;
    }

    public FechaSalida getFechaSalida() {
        return fechaSalida;
    }
}
