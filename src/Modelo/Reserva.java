package Modelo;

import Recursos.RecursoReservable;
import State.EstadoPendiente;
import State.EstadoReserva;

public class Reserva {
    
    private Usuario usuario;
    private RecursoReservable recurso;
    private EstadoReserva estadoActual; // Aquí vive el patrón State

    // Constructor
    public Reserva(Usuario usuario, RecursoReservable recurso) {
        this.usuario = usuario;
        this.recurso = recurso;
        // Por defecto, toda reserva nace como PENDIENTE
        this.estadoActual = new EstadoPendiente();
    }

    // Métodos que delegan el comportamiento al Estado actual
    public String confirmarReserva() {
        return estadoActual.confirmar(this);
    }

    public String cancelarReserva() {
        return estadoActual.cancelar(this);
    }

    // Método para cambiar de estado (usado por las clases de estado)
    public void setEstado(EstadoReserva nuevoEstado) {
        this.estadoActual = nuevoEstado;
    }

    // Getters para ver info
    public String getInfoReserva() {
        return "Reserva [" + estadoActual.getNombreEstado() + "]\n" +
               "Usuario: " + usuario.getNombre() + "\n" +
               "Detalle: " + recurso.reservar(usuario); 
    }
    
    public String getEstadoNombre() {
        return estadoActual.getNombreEstado();
    }
}