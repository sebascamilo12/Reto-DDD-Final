package co.com.sofka.alquiler;

import co.com.sofka.alquiler.events.*;
import co.com.sofka.domain.generic.EventChange;

public class AlquilerChange extends EventChange {
    public AlquilerChange(Alquiler alquiler) {
        apply((AlquilerCreado event) -> {
            alquiler.prestamoId = event.getPrestamoId();
            alquiler.codigo = event.getCodigo();
            alquiler.libroId = event.getLibroId();
            alquiler.nombre = event.getNombre();
        });

        apply((CodigoDeUnPrestamoAsignado event) -> {
            alquiler.asignarCodigoDeUnPrestamo(event.getPrestamoId(), event.getCodigo());
        });

        apply((EstadoDeSalaCambiado event) -> {
            alquiler.sala.actualizarEstado(event.getEstado());
        });

        apply((UbicacionDeSalaCambiado event) -> {
            alquiler.sala.actualizarUbicacion(event.getUbicacion());
        });
        apply((LibroDespachado event) -> {
            alquiler.darSalidaAUnLibro(event.getAlquilerId(), event.getLibroId(), event.getPrestamoId());
        });
        apply((LibroIngresado event) -> {
            alquiler.darEntradaAUnLibro(event.getAlquilerId(), event.getLibroId(), event.getPrestamoId());
        });

        apply((CategoriaDeUnLibroCambiado event) -> {
            alquiler.libro.actualizarCategoria(event.getCategoria());
        });
        apply((DescripcionDeUnLibroCambiado event) -> {
            alquiler.libro.actualizarDescripcion(event.getDescripcion());
        });
        apply((CodigoDeUnPrestamoCambiado event)->{
            alquiler.prestamo.actualizarCodigo(event.getCodigo());
        });

        apply((RegistroDeUnLibroAsignado event)->{
            alquiler.libro.asignarRegistro(event.getRegistroId());
        });

    }
}
