package co.com.sofka.cliente.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.cliente.Cliente;
import co.com.sofka.cliente.commands.CambiarRolDeUnaCuenta;

public class CambiarRolDeUnaCuentaUseCase extends UseCase<RequestCommand<CambiarRolDeUnaCuenta>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<CambiarRolDeUnaCuenta> input) {
        var command= input.getCommand();
        var rol = Cliente.from(command.getClienteId(), repository().getEventsBy(command.getClienteId().value()));
        rol.cambiarRolDeUnaCuenta(command.getCuentaId(),command.getRol());

        emit().onResponse(new ResponseEvents(rol.getUncommittedChanges()));



    }
}
