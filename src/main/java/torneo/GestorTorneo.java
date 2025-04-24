package torneo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GestorTorneo {

    public void jugarPartida(Partida partida, Equipo ganador) {
        partida.setGanador(ganador);
    }

    public void mostrarResultados(Torneo torneo) {
        for (Partida p : torneo.getPartidas()) {
            System.out.println(p);
        }
    }

    public void jugarTorneoEliminacion(Torneo torneo) {
        List<Equipo> equiposRonda = new ArrayList<>(torneo.getEquipos());
        Collections.shuffle(equiposRonda); // Emparejamientos aleatorios

        int ronda = 1;
        while (equiposRonda.size() > 1) {
            System.out.println("\n--- Ronda " + ronda + " ---");
            List<Equipo> ganadores = new ArrayList<>();

            for (int i = 0; i < equiposRonda.size(); i += 2) {
                if (i + 1 < equiposRonda.size()) {
                    Equipo equipo1 = equiposRonda.get(i);
                    Equipo equipo2 = equiposRonda.get(i + 1);
                    Partida partida = new Partida(equipo1, equipo2);

                    // Ganador aleatorio (puedes cambiar esto por lógica real)
                    Equipo ganador = Math.random() < 0.5 ? equipo1 : equipo2;

                    jugarPartida(partida, ganador);
                    torneo.agregarPartida(partida);
                    ganadores.add(ganador);
                    System.out.println(partida);
                } else {
                    // Si hay un número impar, pasa automáticamente a la siguiente ronda
                    ganadores.add(equiposRonda.get(i));
                    System.out.println(equiposRonda.get(i).getNombre() + " pasa automáticamente");
                }
            }

            equiposRonda = ganadores;
            ronda++;
        }

        Equipo campeon = equiposRonda.get(0);
        System.out.println("\n*** Campeón del torneo: " + campeon.getNombre() + " ***");
    }
}
