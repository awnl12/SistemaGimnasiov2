package State;

import Modelo.Reserva; // Esta clase la crearemos en el paso 3

public interface EstadoReserva {
    String confirmar(Reserva reserva);
    String cancelar(Reserva reserva);
    String getNombreEstado(); // Para mostrar en la pantalla después
}