package State;

import Modelo.Reserva; 

public interface EstadoReserva {
    String confirmar(Reserva reserva);
    String cancelar(Reserva reserva);
    String getNombreEstado(); // Para mostrar en la pantalla después
}