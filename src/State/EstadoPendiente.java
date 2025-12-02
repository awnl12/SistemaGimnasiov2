package State;

import Modelo.Reserva;

public class EstadoPendiente implements EstadoReserva {

    @Override
    public String confirmar(Reserva reserva) {
        //si se puede cambia de estado
        reserva.setEstado(new EstadoConfirmada()); //nuevo obj dentro de reserva
        return "Éxito: La reserva ha sido CONFIRMADA.";
    }

    @Override
    public String cancelar(Reserva reserva) {
        
        reserva.setEstado(new EstadoCancelada());
        return "Aviso: La reserva ha sido CANCELADA.";
    }

    @Override
    public String getNombreEstado() {
        return "PENDIENTE";
    }
}