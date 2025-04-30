package torneo;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un torneo.
 * Permite almacenar el nombre del torneo, la lista de equipos participantes y la lista de partidas jugadas.
 *
 * @author Aitor Quilez Herrero (AKA: Thorqui via GitHub)
 * @version 30.04.2025
 */
public class Torneo {
    /** Atributo privado para almacenar el nombre del torneo.*/
    private String nombre;
    /** Atributo privado para almacenar la lista de equipos que participan en el torneo.*/
    private List<Equipo> equipos;
    /** Atributo privado para almacenar la lista de partidas que se han jugado en el torneo.*/
    private List<Partida> partidas;

    /**
     * Constructor de la clase Torneo. Se utiliza para crear una nueva instancia de un torneo.
     * @param nombre El nombre del torneo.
     */
    public Torneo(String nombre) {
        this.nombre = nombre;
        this.equipos = new ArrayList<>();
        this.partidas = new ArrayList<>();
    }

    /**
     * Método público para agregar un equipo a la lista de equipos participantes del torneo.
     * @param equipo El equipo que se va a agregar al torneo.
     */
    public void agregarEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    /**
     * Método público para agregar una partida a la lista de partidas jugadas del torneo.
     * @param partida La partida que se va a agregar al registro del torneo.
     */
    public void agregarPartida(Partida partida) {
        partidas.add(partida);
    }

    /**
     * Método getter público para obtener la lista de equipos participantes en el torneo.
     * @return La lista de objetos Equipo que participan en el torneo.
     */
    public List<Equipo> getEquipos() {
        return equipos;
    }

    /**
     * Método getter público para obtener la lista de partidas jugadas en el torneo.
     * @return La lista de objetos Partida que se han jugado en el torneo.
     */
    public List<Partida> getPartidas() {
        return partidas;
    }

    /**
     * Sobrescritura del método toString() de la clase Object.
     * Este método se llama automáticamente cuando se intenta representar el objeto Torneo como una cadena de texto.
     * @return Una cadena formateada que muestra el nombre del torneo, la cantidad de equipos participantes y la cantidad de partidas jugadas.
     */
    @Override
    public String toString() {
        return "Torneo: " + nombre + ", Equipos: " + equipos.size() + ", Partidas: " + partidas.size();
    }
}