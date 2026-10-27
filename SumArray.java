/*
Creare un programma che:
chiede un numero all'utente per poi dichiarare un array con lunghezza pari al numero inserito.Successivamente riempire l'array chiedendo quali numeri inserire all'utente per poi calcolarne la sommatoria
*/

import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Quanti numeri vuoi inserire? ");
        int size = input.nextInt();

        int[] numbers = new int[size];

        // Riempimento
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Somma
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("La somma è: " + sum);
        input.close();
    }
}