package Recursos;

import Modelo.Usuario;

public class Maquina implements RecursoReservable{
    
    private int id;
    private String nombre;

    public Maquina(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    @Override
    public String reservar(Usuario usuario) {
    return "Maquina: " + nombre + " (ID: " + id + ") " + "\nReservada por " + usuario.getNombre() + "\n [ + " + "Membresia: "+ usuario.getTipoMembresia() + "]";
    }

    @Override
    public String cancelar() {
        return "Reserva de maquina " + nombre + " cancelada";
    }

}
