package torneig;

/**
 * Representa el marcador d'un partit.
 */
public class Marcador {

    /** Punts del jugador 1 */
    private int puntsJugador1;

    /** Punts del jugador 2 */
    private int puntsJugador2;

    /**
     * Constructor del marcador.
     * @param puntsJugador1 punts del jugador 1
     * @param puntsJugador2 punts del jugador 2
     */
    public Marcador(int puntsJugador1, int puntsJugador2) {
        this.puntsJugador1 = puntsJugador1;
        this.puntsJugador2 = puntsJugador2;
    }

    public int getPuntsJugador1() {
        return puntsJugador1;
    }

    public int getPuntsJugador2() {
        return puntsJugador2;
    }

    @Override
    public String toString() {
        return puntsJugador1 + " - " + puntsJugador2;
    }
}
