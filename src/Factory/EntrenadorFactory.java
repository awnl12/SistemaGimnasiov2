package Factory;

import Recursos.Entrenador;
import Recursos.RecursoReservable;



public class EntrenadorFactory extends GimnasioFactory{

    @Override
    public RecursoReservable crearRecurso() {
        return new Entrenador(100, "Marcos Trainer", true);
    }

    
    
}
