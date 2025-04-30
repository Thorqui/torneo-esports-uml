package torneo;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un equipo con una lista de jugadores
 * Permite agregar y buscar jugadores por nombre
 *
 * @author Aitor Quilez Herrero (AKA: Thorqui via GitHub)
 * @version 30.04.2025
 */
public class Equipo {
    /** Atributo privado para almacenar el nombre del equipo */
    private String nombre;
    /** Atributo privado para almacenar una lista de jugadores*/
    private List<Jugador> jugadores;

    /** Constructor de la clase Equipo. Se llama al crear una nueva instancia de Equipo.
    * Recibe como parámetro el nombre del equipo y lo asigna al atributo 'nombre'.
    * Inicializa la lista 'jugadores' con una nueva instancia de ArrayList, asegurando que esté lista para almacenar jugadores.
    */
    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }

    /**
     * Metodo para acceder al nombre del equipo desde fuera de la clase
     * @return nombre del equipo
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo publico para agregar un jugador a la lista del equipo
     * @param jugador Un jugador para agregarlo
     */
    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    /**
     * Metodo publico para obtener la lista de los jugadores del equipo
     * @return lista de jugadores que pertenecen al equipo
     */
    public List<Jugador> getJugadores() {
        return jugadores;
    }

    /**
     * Metodo de sobreescritura toString() de la clase Object
     * @return cadena de caracteres que inclluyen nombre del equipo y la cantidad que tiene
     */
    @Override
    public String toString() {
        return nombre + " con " + jugadores.size() + " jugadores";
    }
}

