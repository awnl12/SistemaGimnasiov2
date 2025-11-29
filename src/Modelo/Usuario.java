package Modelo;

public class Usuario {

    private String nombre;
    private String tipoMembresia;  //TIPO DE MEMBRESIA

    public Usuario(String nombre, String tipoMembresia) {
        this.nombre = nombre;
        this.tipoMembresia = tipoMembresia;
    }

    public String getNombre() {
        return nombre;
    }
                                                    //PARA TRAER CON EL TEXTFIELD
    public String getTipoMembresia() {
        return tipoMembresia;
    }
    
    
    
}
