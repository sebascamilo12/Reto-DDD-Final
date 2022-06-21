package co.com.sofka.alquiler.commands;

import co.com.sofka.alquiler.identities.AlquilerId;
import co.com.sofka.alquiler.identities.LibroId;
import co.com.sofka.alquiler.identities.PrestamoId;
import co.com.sofka.alquiler.values.Categoria;
import co.com.sofka.alquiler.values.Codigo;
import co.com.sofka.alquiler.values.Nombre;
import co.com.sofka.domain.generic.Command;

public class CrearAlquiler extends Command {

    private final AlquilerId alquilerId;
    private final PrestamoId prestamoId;
    private final Codigo codigo;
    private final LibroId libroId;
    private final Nombre nombre;
    private final Categoria categoria;

    public CrearAlquiler(AlquilerId alquilerId, PrestamoId prestamoId, Codigo codigo, LibroId libroId, Nombre nombre, Categoria categoria) {
        this.alquilerId = alquilerId;
        this.prestamoId = prestamoId;
        this.codigo = codigo;
        this.libroId = libroId;
        this.nombre = nombre;
        this.categoria = categoria;
    }

    public AlquilerId getAlquilerId() {
        return alquilerId;
    }

    public PrestamoId getPrestamoId() {
        return prestamoId;
    }

    public Codigo getCodigo() {
        return codigo;
    }

    public LibroId getLibroId() {
        return libroId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}
