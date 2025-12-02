package Factory;

import Recursos.Maquina;
import Recursos.RecursoReservable;

public class MaquinaFactory extends GimnasioFactory {

    @Override
    public RecursoReservable crearRecurso() {

        return new Maquina(1, "Caminadora Especial");
    }
 
}
