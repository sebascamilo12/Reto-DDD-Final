package co.com.sofka.registro.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.registro.identities.InventarioId;
import co.com.sofka.registro.identities.RegistroId;
import co.com.sofka.registro.values.Stock;

public class DisminuirStockDeInventario extends Command {

    private final RegistroId registroId;
    private final InventarioId inventarioId;
    private final Stock stock;

    public DisminuirStockDeInventario(RegistroId registroId, InventarioId inventarioId, Stock stock) {
        this.registroId = registroId;
        this.inventarioId = inventarioId;
        this.stock = stock;
    }

    public RegistroId getRegistroId() {
        return registroId;
    }

    public InventarioId getInventarioId() {
        return inventarioId;
    }

    public Stock getStock() {
        return stock;
    }
}
