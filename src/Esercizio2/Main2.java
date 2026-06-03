package Esercizio2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
        System.out.println("Scrivi un numero!");
        int numero=scanner.nextInt();
        stampaNumero(numero);
    }
public static void stampaNumero(int numero){
switch(numero){
    case 0 -> System.out.println("zero");
    case 1 -> System.out.println("uno");
    case 2 -> System.out.println("due");
    case 3 -> System.out.println("tre");
    default -> System.out.println("Numero non valido");
}
}


}
