package torneig;

/**
 * Representa una persona amb NIF, nom i data de naixement.
 */
public class Persona {

    /** NIF de la persona */
    private Nif nif;

    /** Nom de la persona */
    private String nom;

    /** Data de naixement */
    private Data dataNaixement;

    /**
     * Constructor de la persona.
     * @param nif NIF de la persona
     * @param nom nom de la persona
     * @param dataNaixement data de naixement
     */
    public Persona(Nif nif, String nom, Data dataNaixement) {
        this.nif = nif;
        this.nom = nom;
        this.dataNaixement = dataNaixement;
    }

    public Nif getNif() {
        return nif;
    }

    public void setNif(Nif nif) {
        this.nif = nif;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Data getDataNaixement() {
        return dataNaixement;
    }

    public void setDataNaixement(Data dataNaixement) {
        this.dataNaixement = dataNaixement;
    }

    /**
     * Mostra per consola la informació de la persona.
     */
    public void mostrarInfo() {
        System.out.println("Nom: " + nom);
        System.out.println("NIF: " + nif);
        System.out.println("Data de naixement: " + dataNaixement);
    }
}
