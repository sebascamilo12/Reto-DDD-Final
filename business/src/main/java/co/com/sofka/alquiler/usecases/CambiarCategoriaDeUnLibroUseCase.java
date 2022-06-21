package co.com.sofka.alquiler.usecases;

import co.com.sofka.alquiler.Alquiler;
import co.com.sofka.alquiler.commands.CambiarCategoriaDeUnLibro;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CambiarCategoriaDeUnLibroUseCase extends UseCase<RequestCommand<CambiarCategoriaDeUnLibro>, ResponseEvents> {
    
    @Override
    public void executeUseCase(RequestCommand<CambiarCategoriaDeUnLibro> input) {

        var command = input.getCommand();
        var categoria= Alquiler.from(command.getAlquilerId(),repository().getEventsBy(command.getAlquilerId().value()));
        categoria.cambiarCategoriaDeUnLibro(command.getLibroId(),command.getCategoria());
        emit().onResponse(new ResponseEvents(categoria.getUncommittedChanges()));
        
    }
}
