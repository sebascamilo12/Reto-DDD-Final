package co.com.sofka.registro;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.registro.identities.InventarioId;
import co.com.sofka.registro.values.Stock;

import java.util.Objects;

public class Inventario extends Entity<InventarioId> {
    private Stock stock;

    public Inventario(InventarioId entityId, Stock stock) {
        super(entityId);
        this.stock = stock;
    }

    public void aumentarStock(Stock stock){
        this.stock= stock.aumentar(stock);
    }

    public void disminuirStock(Stock stock){
        this.stock= stock.disminuir(stock);
    }

    public Stock stock() {
        return stock;
    }
}
