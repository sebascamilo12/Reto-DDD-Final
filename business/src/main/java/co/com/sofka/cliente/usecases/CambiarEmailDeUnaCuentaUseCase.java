package co.com.sofka.cliente.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.cliente.Cliente;
import co.com.sofka.cliente.commands.CambiarEmailDeUnaCuenta;

public class CambiarEmailDeUnaCuentaUseCase extends UseCase<RequestCommand<CambiarEmailDeUnaCuenta>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CambiarEmailDeUnaCuenta> input) {
        var command= input.getCommand();
        var email= Cliente.from(command.getClienteId(),repository().getEventsBy(command.getClienteId().value()));
        email.cambiarEmailDeUnaCuenta(command.getCuentaId(),command.getEmail());
        emit().onResponse(new ResponseEvents(email.getUncommittedChanges()));

    }
}
