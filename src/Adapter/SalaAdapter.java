package Adapter;

public class SalaAdapter implements HorarioAdapter{
    private HorarioSala sala;

    public SalaAdapter(HorarioSala sala) {
        this.sala = sala;
    }

    @Override
    public Horario obtenerHorario() {
        String dato = sala.getHorarioSeparador();
        String[] hora = dato.split("\\|");
        
        return new Horario(hora[0], hora[1]);
    }
    
    
}
