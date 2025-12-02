package Modelo;

import Recursos.RecursoReservable;
import State.EstadoPendiente;
import State.EstadoReserva;

public class Reserva {
    
    private Usuario usuario;
    private RecursoReservable recurso;
    private EstadoReserva estadoActual; // Aquí vive el patrón State / aqui se guarda

    // Constructor
    public Reserva(Usuario usuario, RecursoReservable recurso) {
        this.usuario = usuario;
        this.recurso = recurso;
        
        this.estadoActual = new EstadoPendiente(); //nace como pendiente 
    }

    // Métodos para los estados
    public String confirmarReserva() {
        return estadoActual.confirmar(this); // delega , asi que le pregunta al estado
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