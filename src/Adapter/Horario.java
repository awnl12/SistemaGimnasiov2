package Adapter;

public class Horario {
    String inicio;
    String fin;

    public Horario(String inicio, String fin) {
        this.inicio = inicio;
        this.fin = fin;
    }

    @Override
    public String toString() {
        return "Inicio: "+inicio+ ", Fin: "+fin;
    }    
}
