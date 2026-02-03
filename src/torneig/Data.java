package torneig;

/**
 * Representa una data amb dia, mes i any.
 */
public class Data {

    /** Dia de la data */
    private int dia;

    /** Mes de la data */
    private int mes;

    /** Any de la data */
    private int any;

    /**
     * Constructor de la classe Data.
     * @param dia dia
     * @param mes mes
     * @param any any
     */
    public Data(int dia, int mes, int any) {
        this.dia = dia;
        this.mes = mes;
        this.any = any;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + any;
    }
}
