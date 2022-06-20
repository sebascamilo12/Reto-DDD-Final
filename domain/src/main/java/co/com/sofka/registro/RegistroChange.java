package co.com.sofka.registro;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.registro.events.*;

public class RegistroChange extends EventChange {

    public RegistroChange(Registro registro) {

        apply((RegistroCreado event)->{
            registro.inventarioId= event.getInventarioId();
            registro.entradaId = event.getEntradaId();
            registro.salidaId = event.getSalidaId();
        });

        apply((FechaSalidaCambiada event)->{
            registro.salida.actualizarFechaSalida(event.getFechaSalida());
        });

        apply((FechaEntradaCambiada event)->{
            registro.entrada.actualizarFechaEntrada(event.getFechaEntrada());
        });

        apply((StockDeInventarioAumentado event)->{
            registro.inventario.aumentarStock(event.getStock());
        });

        apply((StockDeInventarioDisminuido event)->{
            registro.inventario.disminuirStock(event.getStock());
        });

    }
}
