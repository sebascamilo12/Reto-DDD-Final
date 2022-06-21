package co.com.sofka.alquiler.usecases;

import co.com.sofka.alquiler.commands.CrearAlquiler;
import co.com.sofka.alquiler.events.AlquilerCreado;
import co.com.sofka.alquiler.identities.AlquilerId;
import co.com.sofka.alquiler.identities.LibroId;
import co.com.sofka.alquiler.identities.PrestamoId;
import co.com.sofka.alquiler.values.Categoria;
import co.com.sofka.alquiler.values.Codigo;
import co.com.sofka.alquiler.values.Nombre;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CrearAlquilerUseCaseTest {

    @Test

    void crearNuevoAlquiler(){
        var alquilerId = new AlquilerId();
        var prestamoId = new PrestamoId();
        var codigo = new Codigo("A20");
        var libroId = new LibroId();
        var nombre = new Nombre("Cien años de Soledad");
        var categoria = new Categoria("Amor");
        var command = new CrearAlquiler(alquilerId,prestamoId, codigo, libroId, nombre, categoria);
        var useCase= new CrearAlquilerUseCase();

        List<DomainEvent> events = UseCaseHandler.getInstance().
                syncExecutor(useCase, new RequestCommand<>(command)).
                orElseThrow().
                getDomainEvents();

        AlquilerCreado event = (AlquilerCreado) events.get(0);
        Assertions.assertEquals(prestamoId.value(), event.getPrestamoId().value());
        Assertions.assertEquals("A20", event.getCodigo().value());
        Assertions.assertEquals(libroId.value(), event.getLibroId().value());
        Assertions.assertEquals("Cien años de Soledad", event.getNombre().value());
        Assertions.assertEquals("Amor", event.getCategoria().value());

    }

}