package exercicios;

import javax.swing.*;

public class ToUpperEToLower {
    public static void main (String[] args){
        String frase = JOptionPane.showInputDialog(null, "Insira uma frase ");
        JOptionPane.showMessageDialog(null, "Frase em minúsculo: " + frase.toLowerCase()
                                                                    + "\nFrase em maiúsculo" + frase.toUpperCase());
        System.exit(0);
    }
}
