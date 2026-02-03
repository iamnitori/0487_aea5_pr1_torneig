package torneig;

/**
 * Representa un jugador del torneig.
 * Hereta de la classe Persona.
 */
public class Jugador extends Persona {

    /** Número de llicència del jugador */
    private int numLlicencia;

    /**
     * Constructor del jugador.
     * @param nif NIF del jugador
     * @param nom nom del jugador
     * @param dataNaixement data de naixement
     * @param numLlicencia número de llicència
     */
    public Jugador(Nif nif, String nom, Data dataNaixement, int numLlicencia) {
        super(nif, nom, dataNaixement);
        this.numLlicencia = numLlicencia;
    }

    public int getNumLlicencia() {
        return numLlicencia;
    }

    public void setNumLlicencia(int numLlicencia) {
        this.numLlicencia = numLlicencia;
    }

    /**
     * Mostra per consola la informació del jugador.
     */
    public void mostrarInfoJugador() {
        System.out.println("=== Informació del jugador ===");
        System.out.println("Nom: " + getNom());
        System.out.println("NIF: " + getNif());
        System.out.println("Data de naixement: " + getDataNaixement());
        System.out.println("Número de llicència: " + numLlicencia);
    }

    @Override
    public String toString() {
        return getNom() + " (Llicència: " + numLlicencia + ")";
    }
}
