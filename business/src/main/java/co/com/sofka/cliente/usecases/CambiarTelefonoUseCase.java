package co.com.sofka.cliente.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.cliente.Cliente;
import co.com.sofka.cliente.commands.CambiarTelefono;

public class CambiarTelefonoUseCase extends UseCase<RequestCommand<CambiarTelefono>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<CambiarTelefono> input) {
        var command = input.getCommand();
        var telefono = Cliente.from(command.getClienteId(), repository().getEventsBy(command.getClienteId().value()));
        telefono.cambiarTelefono(command.getTelefono());
        emit().onResponse(new ResponseEvents(telefono.getUncommittedChanges()));
    }
}
