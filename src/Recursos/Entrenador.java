package Recursos;

import Modelo.Usuario;

public class Entrenador implements RecursoReservable{

    
    private int id;
    private String nombre;
    private boolean esVIP;

    public Entrenador(int id, String nombre, boolean esVip) {
        this.id = id;
        this.nombre = nombre;
        this.esVIP = esVIP;
    }

    @Override
    public String reservar(Usuario usuario) {
        String vipText = esVIP ? "ENTRENADOR VIP" : "Entrenador";
        return vipText + " '" + nombre + "' (ID: " + id + ") reservado por "
                + usuario.getNombre() + " [" + usuario.getTipoMembresia() + "]";
        }

    @Override
    public String cancelar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public boolean isEsVIP(){
        return esVIP;
    }
}
