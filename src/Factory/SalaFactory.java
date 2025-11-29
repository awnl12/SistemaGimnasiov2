package Factory;

import Recursos.RecursoReservable;
import Recursos.SalaClase;


public class SalaFactory extends GimnasioFactory{

    @Override
    public RecursoReservable crearRecurso() {
        return new SalaClase(10, "Sala de samba");
    }

}
