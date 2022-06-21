package co.com.sofka.alquiler.events;

import co.com.sofka.alquiler.identities.PrestamoId;
import co.com.sofka.alquiler.values.Codigo;
import co.com.sofka.domain.generic.DomainEvent;

public class CodigoDeUnPrestamoCambiado extends DomainEvent {
    private final PrestamoId prestamoId;
    private final Codigo codigo;

    public CodigoDeUnPrestamoCambiado(PrestamoId prestamoId, Codigo codigo) {
        super("sofka.alquiler.codigodeunprestamocambiado");
        this.prestamoId = prestamoId;
        this.codigo = codigo;
    }

    public PrestamoId getPrestamoId() {
        return prestamoId;
    }

    public Codigo getCodigo() {
        return codigo;
    }
}
