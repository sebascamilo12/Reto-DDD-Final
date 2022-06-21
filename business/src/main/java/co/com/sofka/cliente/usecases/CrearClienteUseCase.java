package co.com.sofka.cliente.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.cliente.Cliente;
import co.com.sofka.cliente.commands.CrearCliente;
import co.com.sofka.cliente.events.ClienteCreado;
import co.com.sofka.cliente.identities.ClienteId;

import java.util.List;

public class CrearClienteUseCase extends UseCase<RequestCommand<CrearCliente>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<CrearCliente> input) {
        var command =input.getCommand();
        var cliente = new Cliente(new ClienteId(), command.getNombre(), command.getTelefono(), command.getCuentaId(), command.getEmail(), command.getRol());
        emit().onResponse(new ResponseEvents(cliente.getUncommittedChanges()));
    }
}
