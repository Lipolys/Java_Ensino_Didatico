package atividades;

import javax.swing.*;

public class Cap04Atividade03 {
    public static void main (String[] args) {
        int tamanho = (int) (Math.random() * 6) + 5;
        //StringBuilder senha = new StringBuilder();
        String senha = "";
       for (int i = 0; i < tamanho; i++) {
           //senha.append((int) (Math.random() * 10));
           senha += (int) (Math.random() * 10);
       }
        JOptionPane.showMessageDialog(null, "Tamanho: " + tamanho + "\nSenha: " + senha);
    }
}
