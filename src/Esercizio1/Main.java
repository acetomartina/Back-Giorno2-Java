package Esercizio1;

import java.util.Scanner;

public class Main {
    static public void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrivi una parola!");
        String testo = scanner.nextLine();
        boolean risultato = stringaPariODispari(testo);
        System.out.println(risultato);

        System.out.println("Dimmi un anno e ti dirò se è bisestile!");
        int year = scanner.nextInt();
        boolean result = annoBisestile(year);
        System.out.println(result);

    }

    // pari o dispari

    public static boolean stringaPariODispari(String text) {
        if (text.length() % 2 == 0) {
            return  true;
        } else {
            return false;
        }
    };

    public static boolean annoBisestile(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if ( year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
