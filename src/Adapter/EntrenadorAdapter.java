package Adapter;

public class EntrenadorAdapter implements HorarioAdapter{
    private HorarioEntrenador entrenador;

    public EntrenadorAdapter(HorarioEntrenador entrenador) {
        this.entrenador = entrenador;
    }
    
    @Override
    public Horario obtenerHorario() {
        String texto = entrenador.getHorarioTexto();
        String partes = texto.replace("Horario:", "").trim();
        String[] hora = partes.split("-");
        
        return new Horario(hora[0].trim(), hora[1].trim());
    }
    
}
