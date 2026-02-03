package torneig;

/**
 * Representa un partit entre dos jugadors.
 */
public class Partit {

    /** Primer participant */
    private Jugador participant1;

    /** Segon participant */
    private Jugador participant2;

    /** Jugador guanyador del partit */
    private Jugador guanyador;

    /** Marcador del partit */
    private Marcador puntuacions;

    /**
     * Constructor del partit.
     * @param p1 jugador 1
     * @param p2 jugador 2
     * @param marcador puntuacions del partit
     */
    public Partit(Jugador p1, Jugador p2, Marcador marcador) {
        this.participant1 = p1;
        this.participant2 = p2;
        this.puntuacions = marcador;
        calcularGuanyador();
    }

    public Jugador getGuanyador() {
        return guanyador;
    }

    public Jugador getParticipant1() {
        return participant1;
    }

    public Jugador getParticipant2() {
        return participant2;
    }

    public Marcador getPuntuacions() {
        return puntuacions;
    }

    /**
     * Calcula el guanyador del partit segons el marcador.
     */
    public void calcularGuanyador() {
        if (puntuacions.getPuntsJugador1() > puntuacions.getPuntsJugador2()) {
            guanyador = participant1;
        } else if (puntuacions.getPuntsJugador2() > puntuacions.getPuntsJugador1()) {
            guanyador = participant2;
        } else {
            guanyador = null;
        }
    }

    @Override
    public String toString() {
        return participant1 + " vs " + participant2 +
               " (" + puntuacions + ")";
    }
}
