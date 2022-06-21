package co.com.sofka.cliente.usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.cliente.commands.CambiarEmailDeUnaCuenta;
import co.com.sofka.cliente.events.ClienteCreado;
import co.com.sofka.cliente.events.EmailDeUnaCuentaCambiado;
import co.com.sofka.cliente.identities.ClienteId;
import co.com.sofka.cliente.identities.CuentaId;
import co.com.sofka.cliente.values.Email;
import co.com.sofka.cliente.values.Nombre;
import co.com.sofka.cliente.values.Rol;
import co.com.sofka.cliente.values.Telefono;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CambiarEmailDeUnaCuentaUseCaseTest {

    @InjectMocks
    private CambiarEmailDeUnaCuentaUseCase useCase;

    @Mock
    private DomainEventRepository repository;

    @Test

    void cambiarEmailDeUnaCuenta(){

        var clienteId= new ClienteId();
        var cuentaId = new CuentaId();
        var email = new Email("prueba2@mail.com");
        var command = new CambiarEmailDeUnaCuenta(clienteId, cuentaId, email);

        when(repository.getEventsBy(clienteId.value())).thenReturn(history());
        useCase.addRepository(repository);



        List<DomainEvent> events= UseCaseHandler.getInstance().
                syncExecutor(useCase, new RequestCommand<>(command)).
                orElseThrow().
                getDomainEvents();

        EmailDeUnaCuentaCambiado event = (EmailDeUnaCuentaCambiado) events.get(0);
        Assertions.assertEquals(cuentaId.value(), event.getCuentaId().value());
        Assertions.assertEquals("prueba2@mail.com", event.getEmail().value());

    }

    private List<DomainEvent> history() {
        var clienteId= new ClienteId();
        Nombre nombre = new Nombre("Sebastian");
        Telefono telefono = new Telefono("3223669046");
        CuentaId cuentaId = CuentaId.of(new CuentaId().value());
        Email email= new Email("prueba@mail.com");
        Rol rol = new Rol(Rol.Roles.ESTUDIANTE);

        var evento = new ClienteCreado(nombre,telefono,cuentaId,email,rol);

        return List.of(evento);
    }
}