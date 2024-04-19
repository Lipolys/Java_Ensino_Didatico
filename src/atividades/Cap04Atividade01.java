package atividades;

import javax.swing.*;

public class Cap04Atividade01 {
    public static void main (String[] args){
        int dado = 0, soma = 0;
        for (int i = 0; i < 3; i++) {
            dado = (int) (Math.random() * 6) + 1;
            soma += dado;
            System.out.println(dado);
        }
        JOptionPane.showMessageDialog(null, "Total: " + soma);
    }
}
