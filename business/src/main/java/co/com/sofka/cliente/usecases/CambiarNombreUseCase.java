package co.com.sofka.cliente.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.cliente.Cliente;
import co.com.sofka.cliente.commands.CambiarNombre;

public class CambiarNombreUseCase extends UseCase<RequestCommand<CambiarNombre>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CambiarNombre> input) {
        var command = input.getCommand();
        var nombre = Cliente.from(command.getClienteId(),repository().getEventsBy(command.getClienteId().value()));
        nombre.cambiarNombre(command.getNombre());
        emit().onResponse(new ResponseEvents(nombre.getUncommittedChanges()));

    }
}
