package torneo;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un enfrentamiento o partido entre dos equipos.
 * Permite almacenar los equipos participantes y el equipo ganador.
 *
 * @author Aitor Quilez Herrero (AKA: Thorqui via GitHub)
 * @version 30.04.2025
 */
public class Partida {
    /** Atributo privado para almacenar el primer equipo que participa en la partida.*/
    private Equipo equipo1;
    /** Atributo privado para almacenar el segundo equipo que participa en la partida.*/
    private Equipo equipo2;
    /** Atributo privado para almacenar el equipo ganador de la partida. Inicialmente es null hasta que se define un ganador.*/
    private Equipo ganador;

    /**
     * Constructor de la clase Partida. Se utiliza para crear una nueva instancia de una partida.
     * @param equipo1 El primer equipo que participa en la partida.
     * @param equipo2 El segundo equipo que participa en la partida.
     */
    public Partida(Equipo equipo1, Equipo equipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
    }

    /**
     * Método setter público para establecer el equipo ganador de la partida.
     * @param ganador El equipo que resultó ganador de la partida.
     */
    public void setGanador(Equipo ganador) {
        this.ganador = ganador;
    }

    /**
     * Método getter público para obtener el equipo ganador de la partida.
     * @return El equipo ganador de la partida. Puede ser null si aún no se ha definido un ganador.
     */
    public Equipo getGanador() {
        return ganador;
    }

    /**
     * Sobrescritura del método toString() de la clase Object.
     * Este método se llama automáticamente cuando se intenta representar el objeto Partida como una cadena de texto.
     * @return Una cadena formateada que muestra los nombres de los dos equipos participantes y el nombre del equipo ganador (o "No definido" si aún no hay ganador).
     */
    @Override
    public String toString() {
        return equipo1.getNombre() + " vs " + equipo2.getNombre() +
                " -> Ganador: " + (ganador != null ? ganador.getNombre() : "No definido");
    }
}

