package Esercizio4;

import java.util.Scanner;

public class Main4 {
    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero");
        int secondi = scanner.nextInt();

        String risultato=contoAllaRovescia(secondi);
        System.out.println(risultato);

    }

      public static String contoAllaRovescia(int secondi) {
        secondi = Math.abs(secondi);

        if (secondi > 20) {
            secondi = 20;
        }

        String report = "";

        for (int i = secondi; i >= 1; i--) {
            if (i % 2 == 0) {
                report += "[OK] Secondo " + i + "\n";
            } else {
                report += "[CHECK] Secondo " + i + "\n";
            }
            if(i==10){
                report  += " ---SEPARAZIONE STADIO---\n";
            }
            if(i==1){
                report  += " ---IGNITION---\n";
            }
        } return report;
    }
}
