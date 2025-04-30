package torneo;

/**
 * Clase que representa jugadores
 * Permite agregar y buscar jugadores por nombre, nickname y mail
 *
 * @author Aitor Quilez Herrero (AKA: Thorqui via GitHub)
 * @version 30.04.2025
 */
public class Jugador {
    /** Atributo privado para almacenar nombre real del jugador*/
    private String nombre;
    /** Atributo privado para almacenar el nickname del jugador que sera unico*/
    private String nickname;
    /** Atributo privado para almacenar el mail del jugador*/
    private String email;

    /**
     * Constructor de la clase Jugador. Se utiliza para crear nuevas instancias de Jugador.
     * @param nombre   El nombre real del jugador.
     * @param nickname El nickname o alias del jugador.
     * @param email    La dirección de correo electrónico del jugador.
     */
    public Jugador(String nombre, String nickname, String email) {
        this.nombre = nombre;
        this.nickname = nickname;
        this.email = email;
    }

    /**
     * Método getter público para acceder al nombre real del jugador.
     * @return El nombre del jugador.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método getter público para acceder al nickname del jugador.
     * @return El nickname del jugador.
     */

    public String getNickname() {
        return nickname;
    }

    /**
     * Método getter público para acceder a la dirección de correo electrónico del jugador.
     * @return La dirección de correo electrónico del jugador.
     * @deprecated Parece haber una confusión en la documentación. Este método se llama 'getEmail' pero devuelve el email.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sobrescritura del método toString() de la clase Object.
     * Este método se llama automáticamente cuando se intenta representar el objeto Jugador como una cadena de texto.
     * @return Una cadena formateada que incluye el nickname, nombre y dirección de correo electrónico del jugador.
     */
    @Override
    public String toString() {
        return nickname + " (" + nombre + ", " + email + " mail)";
    }
}

