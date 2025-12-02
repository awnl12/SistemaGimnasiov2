package State;

import Modelo.Reserva; //hola que hace para el push

public class EstadoConfirmada implements EstadoReserva {

    @Override
    public String confirmar(Reserva reserva) {
        //regla del negocio :ya no se puede reconfirmar
        // no usamos if
        return "Info: Esta reserva YA estaba confirmada."; //da un bloqueo
    }

    @Override
    public String cancelar(Reserva reserva) {
        //si se puede 
        reserva.setEstado(new EstadoCancelada()); // se convierte
        return "️ Aviso: Reserva confirmada anulada. Se procederá al reembolso.";
    }

    @Override
    public String getNombreEstado() {
        return "CONFIRMADA";
    }
}