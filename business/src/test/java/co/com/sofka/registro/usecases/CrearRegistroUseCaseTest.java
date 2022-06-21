package co.com.sofka.registro.usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.registro.commands.CrearRegistro;
import co.com.sofka.registro.events.RegistroCreado;
import co.com.sofka.registro.identities.EntradaId;
import co.com.sofka.registro.identities.InventarioId;
import co.com.sofka.registro.identities.RegistroId;
import co.com.sofka.registro.identities.SalidaId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CrearRegistroUseCaseTest {

    @Test

    void crearRegistro(){

        var registroId= new RegistroId();
        var inventarioId= new InventarioId();
        var entradaId= new EntradaId();
        var salidaId= new SalidaId();
        var command = new CrearRegistro(registroId, inventarioId,entradaId, salidaId);
        var useCase = new CrearRegistroUseCase();

        List<DomainEvent> events = UseCaseHandler.getInstance().
                syncExecutor(useCase, new RequestCommand<>(command)).
                orElseThrow().
                getDomainEvents();

        RegistroCreado event = (RegistroCreado) events.get(0);
        Assertions.assertEquals(inventarioId.value(), event.getInventarioId().value());
        Assertions.assertEquals(entradaId.value(), event.getEntradaId().value());
        Assertions.assertEquals(salidaId.value(), event.getSalidaId().value());




    }

}