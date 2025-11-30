package Recursos;

import Modelo.Usuario;

public class SalaClase implements RecursoReservable {
    
    private int id;
    private String nombre;

    public SalaClase(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    @Override
    public String reservar(Usuario usuario) {
    return "Sala '" + nombre + "' (ID: " + id + ") " + "\n Reservada por: "
                + usuario.getNombre() + " [" + usuario.getTipoMembresia() + "]";    }

    

}
