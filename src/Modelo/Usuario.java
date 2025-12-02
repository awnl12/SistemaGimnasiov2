package Modelo;

public class Usuario {

    private String nombre;
    private String tipoMembresia;  
    public Usuario(String nombre, String tipoMembresia) {
        this.nombre = nombre;
        this.tipoMembresia = tipoMembresia;
    }

    public String getNombre() {
        return nombre;
    }
                                                    //PARA TRaER CON EL TEXTFIELD
    public String getTipoMembresia() {
        return tipoMembresia;
    }
    
    
    
}
