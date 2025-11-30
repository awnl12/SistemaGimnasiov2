package State;

import Modelo.Reserva; //hola que hace para el push

public class EstadoConfirmada implements EstadoReserva {

    @Override
    public String confirmar(Reserva reserva) {
        return "Info: Esta reserva YA estaba confirmada.";
    }

    @Override
    public String cancelar(Reserva reserva) {
        reserva.setEstado(new EstadoCancelada());
        return "️ Aviso: Reserva confirmada anulada. Se procederá al reembolso.";
    }

    @Override
    public String getNombreEstado() {
        return "CONFIRMADA";
    }
}