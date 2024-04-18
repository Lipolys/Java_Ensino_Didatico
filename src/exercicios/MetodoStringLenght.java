package exercicios;

import javax.swing.*;

public class MetodoStringLenght {
    public static void main (String[] args) {
        String frase = JOptionPane.showInputDialog(null, "Insira uma frase:");
        int tamanho = frase.length();
        JOptionPane.showMessageDialog(null, "Tamanho da frase: " + tamanho);
        System.exit(0);
    }
}