package Treino;

import javax.swing.*;

public class ProblemaLucas {
    public static void main (String[] args){
        String[] frases = new String[10];
        boolean[] maisDeDez = new boolean[10];
        for (int i = 0; i < 10; i++) {
            frases[i] = JOptionPane.showInputDialog(null, "Insira 10 frases");
            maisDeDez[i] = (frases[i].length() > 10);
        }
        for (int i = 0; i < 10; i++){

        }

    }
}
