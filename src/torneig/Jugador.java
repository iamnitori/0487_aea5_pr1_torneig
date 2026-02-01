package torneig;

public class Jugador extends Persona {

    // Atribut específic del jugador
    private int numLlicencia;

    // Constructor
    public Jugador(Nif nif, String nom, Data dataNaixement, int numLlicencia) {
        super(nif, nom, dataNaixement);
        this.numLlicencia = numLlicencia;
    }

    // Getter i setter
    public int getNumLlicencia() {
        return numLlicencia;
    }

    public void setNumLlicencia(int numLlicencia) {
        this.numLlicencia = numLlicencia;
    }

    // Mètode útil per mostrar informació del jugador
    public void mostrarInfoJugador() {
        System.out.println("=== Informació del jugador ===");
        System.out.println("Nom: " + getNom());
        System.out.println("NIF: " + getNif());
        System.out.println("Data de naixement: " 
            + getDataNaixement().getDia() + "/" 
            + getDataNaixement().getMes() + "/" 
            + getDataNaixement().getAny());
        System.out.println("Número de llicència: " + numLlicencia);
    }

    @Override
    public String toString() {
        return getNom() + " (Llicència: " + numLlicencia + ")";
    }
}
