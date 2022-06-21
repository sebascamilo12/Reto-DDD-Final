package co.com.sofka.alquiler.usecases;

import co.com.sofka.alquiler.Alquiler;
import co.com.sofka.alquiler.commands.CrearAlquiler;
import co.com.sofka.alquiler.identities.AlquilerId;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CrearAlquilerUseCase extends UseCase<RequestCommand<CrearAlquiler>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<CrearAlquiler> input) {
        var command = input.getCommand();
        var alquiler= new Alquiler(new AlquilerId(), command.getPrestamoId(), command.getCodigo(), command.getLibroId(), command.getNombre(), command.getCategoria());
        emit().onResponse(new ResponseEvents(alquiler.getUncommittedChanges()));

    }
}
