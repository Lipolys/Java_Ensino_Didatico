package atividades;

import javax.swing.*;

public class Cap04Atividade04 {
    public static void main (String[] args) {
        String frase = JOptionPane.showInputDialog(null, "Insira uma frase: ");
        String fraseInversa = "";
        for (int i = 0; i < frase.length(); i++) {
            fraseInversa += frase.charAt(frase.length() - i - 1);
        }
        fraseInversa = fraseInversa.replace(" ", "");
        JOptionPane.showMessageDialog(null, "Frase Inversa: " + fraseInversa);
    }
}
