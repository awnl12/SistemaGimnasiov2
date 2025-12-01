package Adapter;

public class HorarioMaquinaAdapter implements HorarioAdapter{
    private HorarioMaquinaGimnasio maquina;

    public HorarioMaquinaAdapter(HorarioMaquinaGimnasio maquina) {
        this.maquina = maquina;
    }

    @Override
    public Horario obtenerHorario() {
        String json = maquina.getHorarioJSON();
        json = json.replace("{", "").replace("}", "")
                .replace("\"", "");
        
        String[] horario = json.split(",");
        String inicio = horario[0].split(":")[1];
        String fin = horario[1].split(":")[1];
        
        return new Horario(inicio, fin);
    }
    
    
}
