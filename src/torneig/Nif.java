package torneig;

/**
 * Representa un NIF format per DNI i lletra.
 */
public class Nif {

    /** Número del DNI */
    private int dni;

    /** Lletra del NIF */
    private char lletra;

    /**
     * Constructor del NIF.
     * @param dni número de DNI
     * @param lletra lletra del NIF
     */
    public Nif(int dni, char lletra) {
        this.dni = dni;
        this.lletra = lletra;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public char getLletra() {
        return lletra;
    }

    public void setLletra(char lletra) {
        this.lletra = lletra;
    }

    @Override
    public String toString() {
        return dni + "" + lletra;
    }
}
