/* programa em java para ler uma frase e imprimir a quantidade de vogais presentes */

import java.util.Scanner;

public class functions01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        int totalDeVogais = 0;
        char[] letra;
        char aux;

        System.out.println("Frase -->");
        frase = sc.nextLine();

        letra = frase.toCharArray();

        // percorrendo a string caractere por caractere em um vetor

        for (int i = 0; i < letra.length; i++){
            System.out.print(letra[i] + "\t");
        }

        // percorrendo a string caractere por caractere dentro da própria string
        System.out.println();
        for (int i = 0; i < frase.length(); i++ ) {
            System.out.print(frase.charAt(i) + "\t");
        }

        frase = frase.toLowerCase();
        for (int i = 0; i < frase.length(); i++){
            aux = frase.charAt(i);
            switch (aux) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    totalDeVogais++;
            }
        }
        System.out.println("Total de vogais = " + totalDeVogais);
    }
}
