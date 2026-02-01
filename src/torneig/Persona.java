package torneig;

public class Persona {

    // Atributs
    private Nif nif;
    private String nom;
    private Data dataNaixement;

    // Constructor
    public Persona(Nif nif, String nom, Data dataNaixement) {
        this.nif = nif;
        this.nom = nom;
        this.dataNaixement = dataNaixement;
    }

    // Getters i setters
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

    // Mètode útil per mostrar informació
    public void mostrarInfo() {
        System.out.println("Nom: " + nom);
        System.out.println("NIF: " + nif);
        System.out.println("Data de naixement: " 
            + dataNaixement.getDia() + "/" 
            + dataNaixement.getMes() + "/" 
            + dataNaixement.getAny());
    }
}

   

