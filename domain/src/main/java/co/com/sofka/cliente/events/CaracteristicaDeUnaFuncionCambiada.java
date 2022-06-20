package co.com.sofka.cliente.events;

import co.com.sofka.cliente.identities.FuncionId;
import co.com.sofka.cliente.values.Caracteristica;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.Objects;

public class CaracteristicaDeUnaFuncionCambiada extends DomainEvent {

    private final FuncionId funcionId;
    private final Caracteristica caracteristica;

    public CaracteristicaDeUnaFuncionCambiada(FuncionId funcionId, Caracteristica caracteristica) {
        super("sofka.cliente.caracteristicadeunafuncioncambiada");
        Objects.requireNonNull(funcionId);
        Objects.requireNonNull(caracteristica);
        this.funcionId = funcionId;
        this.caracteristica = caracteristica;
    }

    public FuncionId getFuncionId() {
        return funcionId;
    }

    public Caracteristica getCaracteristica() {
        return caracteristica;
    }
}
