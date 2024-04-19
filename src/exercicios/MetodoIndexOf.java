package exercicios;

import java.util.Scanner;

public class MetodoIndexOf {
    public static void main (String[] args) {
        System.out.println("Insira uma frase");
        Scanner sc = new Scanner (System.in);
        String frase = sc.nextLine();
        char caractere = 'a';
        System.out.println("Frase: " + frase
                            + "\nCaractere " + caractere + ": " + frase.indexOf(caractere)
                            + "\nCaractere " + caractere + " a partir da 10ª posição: " + frase.indexOf(caractere, 9)
                            + "\nPalavra 'Ensino' :" + frase.indexOf("Ensino")
                            + "\nPalavra 'ensino' :" + frase.indexOf("ensino")
                            + "\nPalavra 'Java' :" + frase.indexOf("Java"));
    }
}
