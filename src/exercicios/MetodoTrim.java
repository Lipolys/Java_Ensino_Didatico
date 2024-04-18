package exercicios;

public class MetodoTrim {
    public static void main (String[] args) {
        String frase = "    frase frase     ";
        System.out.println("|" + frase + "|");
        System.out.println("|" + frase.trim() + "|");
        frase = frase.trim();
        System.out.println("|" + frase + "|");
    }
}
