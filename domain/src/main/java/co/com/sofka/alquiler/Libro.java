package co.com.sofka.alquiler;

import co.com.sofka.alquiler.identities.LibroId;
import co.com.sofka.alquiler.values.Categoria;
import co.com.sofka.alquiler.values.Descripcion;
import co.com.sofka.alquiler.values.Nombre;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.registro.Registro;
import co.com.sofka.registro.identities.RegistroId;

import java.util.Objects;

public class Libro extends Entity<LibroId> {
    private Categoria categoria;
    private Descripcion descripcion;
    private Nombre nombre;
    private RegistroId registroId;

    public Libro(LibroId entityId, Categoria categoria, Descripcion descripcion, Nombre nombre, RegistroId registroId) {
        super(entityId);
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.registroId = registroId;
    }

    public void actualizarCategoria(Categoria categoria){
        Objects.requireNonNull(categoria);
    }
    public void actualizarNombre(Nombre nombre){
        Objects.requireNonNull(nombre);
    }

    public void actualizarDescripcion(Descripcion descripcion){
        Objects.requireNonNull(descripcion);
    }

    public void asignarRegistro(RegistroId registroId){
        Objects.requireNonNull(registroId);
    }

    public Categoria categoria() {
        return categoria;
    }

    public Descripcion descripcion() {
        return descripcion;
    }

    public Nombre nombre() {
        return nombre;
    }

    public RegistroId registroId() {
        return registroId;
    }
}
