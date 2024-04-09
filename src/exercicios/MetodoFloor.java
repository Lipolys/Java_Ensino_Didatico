package exercicios;

import javax.swing.*;

public class MetodoFloor {
    public static void main (String[] args) {
        float nota = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira uma nova nota: "));
        JOptionPane.showMessageDialog(null, "Nota original: " + nota
                                                                    + "\nNova nota: " + (int) Math.floor(nota));
        System.exit(1);
    }
}
