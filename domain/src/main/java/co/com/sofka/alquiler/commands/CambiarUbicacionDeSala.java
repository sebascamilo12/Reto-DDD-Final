package co.com.sofka.alquiler.commands;

import co.com.sofka.alquiler.identities.AlquilerId;
import co.com.sofka.alquiler.identities.SalaId;
import co.com.sofka.alquiler.values.Ubicacion;
import co.com.sofka.domain.generic.Command;

public class CambiarUbicacionDeSala extends Command {
    private final AlquilerId alquilerId;
    private final SalaId salaId;
    private final Ubicacion ubicacion;

    public CambiarUbicacionDeSala(AlquilerId alquilerId, SalaId salaId, Ubicacion ubicacion) {
        this.alquilerId = alquilerId;
        this.salaId = salaId;
        this.ubicacion = ubicacion;
    }

    public AlquilerId getAlquilerId() {
        return alquilerId;
    }

    public SalaId getSalaId() {
        return salaId;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }
}
