package co.com.sofka.cliente.usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.cliente.commands.CrearCliente;
import co.com.sofka.cliente.events.ClienteCreado;
import co.com.sofka.cliente.identities.ClienteId;
import co.com.sofka.cliente.identities.CuentaId;
import co.com.sofka.cliente.values.Email;
import co.com.sofka.cliente.values.Nombre;
import co.com.sofka.cliente.values.Rol;
import co.com.sofka.cliente.values.Telefono;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static co.com.sofka.cliente.values.Rol.Roles.ESTUDIANTE;
import static org.junit.jupiter.api.Assertions.*;

class CrearClienteUseCaseTest {

    @Test
    void crearNuevoCliente(){

        var clienteId = ClienteId.of("1");
        var nombre = new Nombre("Sebastian");
        var telefono= new Telefono("3223669046");
        var cuentaId = new CuentaId();
        var email = new Email("prueba@mail.com");
        var rol = new Rol(ESTUDIANTE);
        var command = new CrearCliente(clienteId, nombre, telefono, cuentaId, email, rol);
        var useCase = new CrearClienteUseCase();

        List<DomainEvent> events= UseCaseHandler.getInstance().
                syncExecutor(useCase,new RequestCommand<>(command)).
                orElseThrow().
                getDomainEvents();

        ClienteCreado event = (ClienteCreado) events.get(0);
        Assertions.assertEquals("Sebastian", event.getNombre().value());
        Assertions.assertEquals("3223669046", event.getTelefono().value());
        Assertions.assertEquals(cuentaId.value(), event.getCuentaId().value());
        Assertions.assertEquals("prueba@mail.com", event.getEmail().value());
        Assertions.assertEquals(ESTUDIANTE, event.getRol().value());

    }

}