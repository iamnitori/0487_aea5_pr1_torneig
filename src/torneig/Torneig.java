package torneig;

import java.util.ArrayList;

/**
 * Representa un torneig format per diversos partits.
 * Guarda la data, els partits jugats i el jugador guanyador.
 */
public class Torneig {

    /** Data en què es realitza el torneig */
    private Data data;

    /** Nombre de partits jugats */
    private int partitsJugats;

    /** Llista de partits del torneig */
    private ArrayList<Partit> partits;

    /** Jugador guanyador del torneig */
    private Jugador guanyador;

    /**
     * Constructor del torneig.
     * @param data data del torneig
     */
    public Torneig(Data data) {
        this.data = data;
        this.partits = new ArrayList<>();
        this.partitsJugats = 0;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public int getPartitsJugats() {
        return partitsJugats;
    }

    public ArrayList<Partit> getPartits() {
        return partits;
    }

    public Jugador getGuanyador() {
        return guanyador;
    }

    /**
     * Afegeix un partit al torneig.
     * @param p partit a afegir
     */
    public void afegirPartit(Partit p) {
        partits.add(p);
        partitsJugats++;
    }

    /**
     * Calcula el guanyador del torneig segons
     * el nombre de partits guanyats.
     */
    public void calcularGuanyador() {
        int maxVictories = 0;

        for (Partit p : partits) {
            Jugador g = p.getGuanyador();
            if (g != null) {
                int count = 0;
                for (Partit p2 : partits) {
                    if (g.equals(p2.getGuanyador())) {
                        count++;
                    }
                }
                if (count > maxVictories) {
                    maxVictories = count;
                    guanyador = g;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Torneig [data=" + data +
               ", partitsJugats=" + partitsJugats +
               ", guanyador=" + guanyador + "]";
    }
}
