package torneo;

import java.util.ArrayList;
import java.util.List;

public class Partida {
    private Equipo equipo1;
    private Equipo equipo2;
    private Equipo ganador;

    public Partida(Equipo equipo1, Equipo equipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
    }

    public void setGanador(Equipo ganador) {
        this.ganador = ganador;
    }

    public Equipo getGanador() {
        return ganador;
    }

    @Override
    public String toString() {
        return equipo1.getNombre() + " vs " + equipo2.getNombre() +
                " -> Ganador: " + (ganador != null ? ganador.getNombre() : "No definido");
    }
}

