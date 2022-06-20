package co.com.sofka.cliente;

import co.com.sofka.cliente.events.*;
import co.com.sofka.domain.generic.EventChange;

public class ClienteChange extends EventChange {

    public ClienteChange(Cliente cliente) {
        apply((ClienteCreado event)->{
            cliente.nombre= event.getNombre();
            cliente.telefono = event.getTelefono();
            cliente.cuenta = new Cuenta(event.getCuentaId(), event.getEmail(), event.getRol());

        });

        apply((NombreCambiado event)->{
            cliente.nombre= event.getNombre();
        });

        apply((TelefonoCambiado event)->{
            cliente.telefono = event.getTelefono();
        });

        apply((EmailDeUnaCuentaCambiado event)->{
            cliente.cuenta.actualizarEmail(event.getEmail());

        });

        apply((RolDeUnaCuentaCambiado event)->{
           cliente.cuenta.actualizarRol(event.getRol());
        });

        apply((CuentaAgregada event)->{
            cliente.agregarCuenta(event.getCuentaId());
        });

        apply((FuncionAgregada event)->{
            cliente.funciones().add(new Funcion(
                    event.getFuncionId(),
                    event.getDescripcion(),
                    event.getCaracteristica()));
        });

        apply((AlquilerAsociado event)->{
           cliente.asociarAlquiler(event.getAlquilerId());
        });

        apply((CantidadDeHistorialCambiada event)->{
            cliente.historial.actualizarCantidad(event.getCantidad());
        });

        apply((CaracteristicaDeUnaFuncionCambiada event) ->{
            var funcion = cliente.getFuncionPorId(event.getFuncionId())
                    .orElseThrow(()-> new IllegalArgumentException("No se encuentra la caracteristica del cliente"));
            funcion.actualizarCaracteristica(event.getCaracteristica());
        });

        apply((DescripcionDeUnaFuncionCambiada event)->{
            var funcion = cliente.getFuncionPorId(event.getFuncionId())
                    .orElseThrow(()-> new IllegalArgumentException("No se encuentra la caracteristica del cliente"));
            funcion.actualizarDescripcion(event.getDescripcion());
        });





    }
}
