package org.example;

import torneo.*;

public class Main {
    public static void main(String[] args) {
        // Crear jugadores y equipos
        Equipo e1 = crearEquipo("Dragons", "Shadow", "Luci");
        Equipo e2 = crearEquipo("Titans", "Blade", "Star");
        Equipo e3 = crearEquipo("Phoenix", "Flame", "Neo");
        Equipo e4 = crearEquipo("Wolves", "Frost", "Kira");

        // Crear torneo y añadir equipos
        Torneo torneo = new Torneo("Torneo Eliminación 2025");
        torneo.agregarEquipo(e1);
        torneo.agregarEquipo(e2);
        torneo.agregarEquipo(e3);
        torneo.agregarEquipo(e4);

        // Ejecutar torneo
        GestorTorneo control = new GestorTorneo();
        control.jugarTorneoEliminacion(torneo);
    }

    private static Equipo crearEquipo(String nombre, String nick1, String nick2) {
        Equipo equipo = new Equipo(nombre);
        equipo.agregarJugador(new Jugador("Jugador " + nick1, nick1, "@mail"));
        equipo.agregarJugador(new Jugador("Jugador " + nick2, nick2, "@mail2"));
        return equipo;
    }
}