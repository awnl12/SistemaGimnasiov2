package State;
//define estados que debe cumplir
import Modelo.Reserva; 

public interface EstadoReserva {
    String confirmar(Reserva reserva);
    String cancelar(Reserva reserva);
    String getNombreEstado(); // Para mostrar en la pantalla después
}