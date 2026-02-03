import torneig.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Jugador> jugadors = new ArrayList<>();
    static ArrayList<Torneig> torneigs = new ArrayList<>();

    public static void main(String[] args) {

        int op;

        do {
            System.out.println("\n--- MENU TORNEIG ---");
            System.out.println("1. Afegir jugador");
            System.out.println("2. Crear torneig");
            System.out.println("3. Afegir partit a torneig");
            System.out.println("4. Mostrar torneigs");
            System.out.println("0. Sortir");
            System.out.print("Opció: ");

            op = sc.nextInt();

            switch (op) {
                case 1 -> crearJugador();
                case 2 -> crearTorneig();
                case 3 -> afegirPartit();
                case 4 -> mostrarTorneigs();
            }

        } while (op != 0);
    }

    static void crearJugador() {
        sc.nextLine();
        System.out.print("Nom: ");
        String nom = sc.nextLine();

        System.out.print("DNI: ");
        int dni = sc.nextInt();

        System.out.print("Lletra: ");
        char lletra = sc.next().charAt(0);

        System.out.print("Data naixement (d m a): ");
        Data data = new Data(sc.nextInt(), sc.nextInt(), sc.nextInt());

        System.out.print("Num llicència: ");
        int lic = sc.nextInt();

        jugadors.add(new Jugador(new Nif(dni, lletra), nom, data, lic));
    }

    static void crearTorneig() {
        System.out.print("Data torneig (d m a): ");
        Data d = new Data(sc.nextInt(), sc.nextInt(), sc.nextInt());
        torneigs.add(new Torneig(d));
    }

    static void afegirPartit() {
        if (jugadors.size() < 2 || torneigs.isEmpty()) {
            System.out.println("No hi ha prou jugadors o torneigs.");
            return;
        }

        Torneig t = torneigs.get(0); // simplificat

        Jugador j1 = jugadors.get(0);
        Jugador j2 = jugadors.get(1);

        System.out.print("Punts jugador 1: ");
        int p1 = sc.nextInt();

        System.out.print("Punts jugador 2: ");
        int p2 = sc.nextInt();

        Partit p = new Partit(j1, j2, new Marcador(p1, p2));
        t.afegirPartit(p);
        t.calcularGuanyador();
    }

    static void mostrarTorneigs() {
        torneigs.forEach(System.out::println);
    }
}
