package State;

import Modelo.Reserva;

public class EstadoPendiente implements EstadoReserva {

    @Override
    public String confirmar(Reserva reserva) {
        // Lógica de transición
        reserva.setEstado(new EstadoConfirmada());
        return "Éxito: La reserva ha sido CONFIRMADA.";
    }

    @Override
    public String cancelar(Reserva reserva) {
        // Lógica de transición
        reserva.setEstado(new EstadoCancelada());
        return "Aviso: La reserva ha sido CANCELADA.";
    }

    @Override
    public String getNombreEstado() {
        return "PENDIENTE";
    }
}