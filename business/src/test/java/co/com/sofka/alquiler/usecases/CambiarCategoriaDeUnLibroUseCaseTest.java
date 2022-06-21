package co.com.sofka.alquiler.usecases;

import co.com.sofka.alquiler.commands.CambiarCategoriaDeUnLibro;
import co.com.sofka.alquiler.events.AlquilerCreado;
import co.com.sofka.alquiler.events.CategoriaDeUnLibroCambiado;
import co.com.sofka.alquiler.identities.AlquilerId;
import co.com.sofka.alquiler.identities.LibroId;
import co.com.sofka.alquiler.identities.PrestamoId;
import co.com.sofka.alquiler.values.Categoria;
import co.com.sofka.alquiler.values.Codigo;
import co.com.sofka.alquiler.values.Nombre;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CambiarCategoriaDeUnLibroUseCaseTest {

    @InjectMocks
    private CambiarCategoriaDeUnLibroUseCase useCase;

    @Mock
    private DomainEventRepository repository;

    @Test
    void cambiarCategoriaDeUnLibro(){

        var alquilerId= new AlquilerId();
        var libroId= new LibroId();
        var categoria= new Categoria("Comedia-Amor");
        var command = new CambiarCategoriaDeUnLibro(alquilerId, libroId, categoria);

        when(repository.getEventsBy(alquilerId.value())).thenReturn(history());
        useCase.addRepository(repository);



        List<DomainEvent> events= UseCaseHandler.getInstance().
                syncExecutor(useCase, new RequestCommand<>(command)).
                orElseThrow().
                getDomainEvents();

        CategoriaDeUnLibroCambiado event = (CategoriaDeUnLibroCambiado) events.get(0);
        Assertions.assertEquals(libroId.value(),event.getLibroId().value());
        Assertions.assertEquals("Comedia-Amor",event.getCategoria().value());


    }

    private List<DomainEvent> history() {

        var prestamoId = new PrestamoId();
        var codigo = new Codigo("A20");
        var libroId = new LibroId();
        var nombre = new Nombre("Cien años de Soledad");
        var categoria = new Categoria("Amor");
        var evento = new AlquilerCreado(prestamoId, codigo, libroId, nombre, categoria);

        return List.of(evento);

    }

}