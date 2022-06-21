package co.com.sofka.registro.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.registro.Registro;
import co.com.sofka.registro.commands.CrearRegistro;
import co.com.sofka.registro.identities.RegistroId;

public class CrearRegistroUseCase extends UseCase<RequestCommand<CrearRegistro>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearRegistro> input) {
        var command= input.getCommand();
        var registro = new Registro(new RegistroId(), command.getInventarioId(), command.getEntradaId(), command.getSalidaId());
        emit().onResponse(new ResponseEvents(registro.getUncommittedChanges()));

    }
}
