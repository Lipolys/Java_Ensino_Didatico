package exercicios;

import java.util.Scanner;

public class MetodoChatAtRepeticao {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        for (int i = 0; i < frase.length(); i++) {
            System.out.print(frase.charAt(i));
        }
        System.out.print ("\n");
        for (int i = frase.length() - 1; i >= 0;  i--) {
            System.out.print(frase.charAt(i));
        }
    }
}
