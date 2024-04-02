package atividades;

import javax.swing.*;
import java.util.Objects;

public class Cap03Atividade03 {
    public static void main (String[] args) {
        try {
            int i = 3;
            boolean autenticacao = false;
            do {
                String login = JOptionPane.showInputDialog(null, "LOGIN: ");
                login = login.toString();
                String senha = JOptionPane.showInputDialog(null, "SENHA: ");
                senha = senha.toString();
                i--;
                if (Objects.equals(login, "java8") && Objects.equals(senha, "java8")) {
                    JOptionPane.showMessageDialog(null, "Autenticado");
                    autenticacao = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Acesso negado!\nVocê tem mais " + i + " chances.");
                }
            } while (i > 0 && !autenticacao);
            System.exit(0);
        }catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Encerrando a Operação");
        }
    }
}
