package atividades;

import javax.swing.*;

public class Cap04Atividade05 {
    public static void main (String[] args) {
        String frase = JOptionPane.showInputDialog(null, "Insira uma frase: ");
        /*if (!frase.contains("sexual") && !frase.contains("sexo")) {
            JOptionPane.showMessageDialog(null, "Frase aceita");
        } else {
            JOptionPane.showMessageDialog(null, "Conteúdo impóprio");
        }*/
        if (frase.indexOf("sexual") == -1 && frase.indexOf("sexo") == -1 ) {
            JOptionPane.showMessageDialog(null, "Frase aceita");
        } else {
            JOptionPane.showMessageDialog(null, "Conteúdo impóprio");
        }

    }
}
