package co.com.sofka.registro.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.registro.identities.InventarioId;
import co.com.sofka.registro.values.Stock;

public class StockDeInventarioAumentado extends DomainEvent {
    private final InventarioId inventarioId;
    private final Stock stock;

    public StockDeInventarioAumentado(InventarioId inventarioId, Stock stock) {
        super("sofka.registro.stockdeinventarioaumentado");
        this.inventarioId = inventarioId;
        this.stock = stock;
    }

    public InventarioId getInventarioId() {
        return inventarioId;
    }

    public Stock getStock() {
        return stock;
    }
}
