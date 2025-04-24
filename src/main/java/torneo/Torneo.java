package torneo;

import java.util.ArrayList;
import java.util.List;

public class Torneo {
    private String nombre;
    private List<Equipo> equipos;
    private List<Partida> partidas;

    public Torneo(String nombre) {
        this.nombre = nombre;
        this.equipos = new ArrayList<>();
        this.partidas = new ArrayList<>();
    }

    public void agregarEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    public void agregarPartida(Partida partida) {
        partidas.add(partida);
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public List<Partida> getPartidas() {
        return partidas;
    }

    @Override
    public String toString() {
        return "Torneo: " + nombre + ", Equipos: " + equipos.size() + ", Partidas: " + partidas.size();
    }
}