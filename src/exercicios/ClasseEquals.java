package exercicios;

public class ClasseEquals {
    public static void main (String[] args) {
        String frase1 = "SIM";
        String frase2 = "sim";
        if (frase1.equals(frase2)) {
            System.out.println ("equals() comparou positivo");
        } else if (frase1.equalsIgnoreCase(frase2)) {
            System.out.println ("equalsIgnoreCase() comparou positivo");
        }

    }
}
