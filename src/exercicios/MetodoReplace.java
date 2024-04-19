package exercicios;

import java.util.Scanner;

public class MetodoReplace {
    public static void main (String[] args) {
        System.out.println ("Foneça uma frase: ");
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        System.out.println ("Retirando os espaços da sua frase: " + frase.replace(" ", ""));
        System.out.println ("Substituindo 'a' por 'u': " + frase.replace("a", "u"));
    }
}
