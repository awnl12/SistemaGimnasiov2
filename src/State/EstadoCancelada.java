package State;

import Modelo.Reserva;

public class EstadoCancelada implements EstadoReserva {

    @Override
    public String confirmar(Reserva reserva) {
        return "Error: No se puede confirmar una reserva que fue CANCELADA.";
    }

    @Override
    public String cancelar(Reserva reserva) {
        return "Error: La reserva ya está cancelada.";
    }

    @Override
    public String getNombreEstado() {
        return "CANCELADA";
    }
}