package Proxy;

import Modelo.Usuario;
import Recursos.Entrenador;
import Recursos.RecursoReservable;

public class RecursoProxy implements RecursoReservable {

    private RecursoReservable recursoReal;

    public RecursoProxy(RecursoReservable recursoReal) {
        this.recursoReal = recursoReal;
    }

    @Override
    public String reservar(Usuario usuario) {

        if (recursoReal instanceof Entrenador) {

            Entrenador ent = (Entrenador) recursoReal;

            if (ent.isEsVIP() &&
                !usuario.getTipoMembresia().equalsIgnoreCase("Vip")) {

                return "ACCESO DENEGADO: Este entrenador es VIP.\n"
                     + "Solo usuarios con membresía VIP pueden reservarlo.";
            }
        }

        return recursoReal.reservar(usuario);
    }
}
