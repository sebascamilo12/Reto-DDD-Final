package co.com.sofka.registro;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.registro.events.*;
import co.com.sofka.registro.identities.EntradaId;
import co.com.sofka.registro.identities.InventarioId;
import co.com.sofka.registro.identities.RegistroId;
import co.com.sofka.registro.identities.SalidaId;
import co.com.sofka.registro.values.FechaEntrada;
import co.com.sofka.registro.values.FechaSalida;
import co.com.sofka.registro.values.Stock;

import java.util.List;
import java.util.Objects;

public class Registro extends AggregateEvent<RegistroId> {
    protected InventarioId inventarioId;
    protected EntradaId entradaId;
    protected SalidaId salidaId;

    protected Salida salida;

    protected Entrada entrada;

    protected Inventario inventario;

    public Registro(RegistroId entityId, InventarioId inventarioId, EntradaId entradaId, SalidaId salidaId) {
        super(entityId);
        Objects.requireNonNull(inventarioId);
        Objects.requireNonNull(entradaId);
        Objects.requireNonNull(salidaId);
        subscribe(new RegistroChange(this));
        appendChange(new RegistroCreado(inventarioId, entradaId, salidaId)).apply();

    }

    private Registro(RegistroId entityId){
        super(entityId);
        subscribe(new RegistroChange(this));

    }

    public static Registro from(RegistroId registroId, List<DomainEvent> events){
        var registro= new Registro(registroId);
        return registro;
    }

    public void cambiarFechaSalida(SalidaId salidaId, FechaSalida fechaSalida){
        Objects.requireNonNull(salidaId);
        Objects.requireNonNull(fechaSalida);
        appendChange(new FechaSalidaCambiada(salidaId, fechaSalida)).apply();
    }

    public void cambiarFechaEntrada(EntradaId entradaId, FechaEntrada fechaEntrada){
        Objects.requireNonNull(entradaId);
        Objects.requireNonNull(fechaEntrada);
        appendChange(new FechaEntradaCambiada(entradaId, fechaEntrada)).apply();
    }

    public void aumentarStockDeInventario(InventarioId inventarioId, Stock stock){
        Objects.requireNonNull(inventarioId);
        Objects.requireNonNull(stock);
        appendChange(new StockDeInventarioAumentado(inventarioId, stock)).apply();
    }

    public void disminuirStockDeInventario(InventarioId inventarioId, Stock stock){
        Objects.requireNonNull(inventarioId);
        Objects.requireNonNull(stock);
        appendChange(new StockDeInventarioDisminuido(inventarioId, stock)).apply();
    }

    public InventarioId inventarioId() {
        return inventarioId;
    }

    public EntradaId entradaId() {
        return entradaId;
    }

    public SalidaId salidaId() {
        return salidaId;
    }

    public Salida salida() {
        return salida;
    }

    public Entrada entrada() {
        return entrada;
    }

    public Inventario inventario() {
        return inventario;
    }
}
