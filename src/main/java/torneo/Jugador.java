package torneo;

public class Jugador {
    private String nombre;
    private String nickname;
    private String email;

    public Jugador(String nombre, String nickname, String email) {
        this.nombre = nombre;
        this.nickname = nickname;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNickname() {
        return nickname;
    }

    public String getEdad() {
        return email;
    }

    @Override
    public String toString() {
        return nickname + " (" + nombre + ", " + email + " años)";
    }
}

