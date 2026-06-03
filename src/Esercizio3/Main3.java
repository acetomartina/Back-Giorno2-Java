package Esercizio3;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrivi del testo!");
        String testo = scanner.nextLine();
        while (!testo.equals(":q")) {
            separaTesto(testo);
            System.out.println("Riprova! Se vuoi terminare il gioco scrivi: ':q'");
            testo = scanner.nextLine();
        }
        System.out.println("Hai indovinato! Tor");
    }

    public static void separaTesto(String testo) {
        for (int i = 0; i < testo.length(); i++) {
            if (i < testo.length() - 1) {
                System.out.print(testo.charAt(i) + ",");
            } else {
                System.out.print(testo.charAt(i));
            }
        }
        System.out.println();
    }

}
