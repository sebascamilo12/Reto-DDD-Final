package co.com.sofka.alquiler.commands;

import co.com.sofka.alquiler.identities.AlquilerId;
import co.com.sofka.alquiler.identities.SalaId;
import co.com.sofka.alquiler.values.Estado;
import co.com.sofka.domain.generic.Command;

public class CambiarEstadoDeSala extends Command {

    private final AlquilerId alquilerId;
    private final SalaId salaId;
    private final Estado estado;

    public CambiarEstadoDeSala(AlquilerId alquilerId, SalaId salaId, Estado estado) {
        this.alquilerId = alquilerId;
        this.salaId = salaId;
        this.estado = estado;
    }

    public AlquilerId getAlquilerId() {
        return alquilerId;
    }

    public SalaId getSalaId() {
        return salaId;
    }

    public Estado getEstado() {
        return estado;
    }
}
