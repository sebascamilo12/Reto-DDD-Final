package co.com.sofka.alquiler.commands;

import co.com.sofka.alquiler.identities.AlquilerId;
import co.com.sofka.alquiler.identities.PrestamoId;
import co.com.sofka.alquiler.values.Codigo;
import co.com.sofka.domain.generic.Command;

public class AsignarCodigoDeUnPrestamo extends Command {

    private final AlquilerId alquilerId;
    private final PrestamoId prestamoId;
    private final Codigo codigo;

    public AsignarCodigoDeUnPrestamo(AlquilerId alquilerId, PrestamoId prestamoId, Codigo codigo) {
        this.alquilerId = alquilerId;
        this.prestamoId = prestamoId;
        this.codigo = codigo;
    }

    public AlquilerId getAlquilerId() {
        return alquilerId;
    }

    public PrestamoId getPrestamoId() {
        return prestamoId;
    }

    public Codigo getCodigo() {
        return codigo;
    }
}
