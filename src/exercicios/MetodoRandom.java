package exercicios;

import javax.swing.*;

public class MetodoRandom {
    public static void main(String[] args) {
        String senha = "";
        for (int i = 0; i < 10; i++) {
            int num = (int) (Math.random() * 10);
            senha += num;
        }
        JOptionPane.showMessageDialog(null, "SENHA: " + senha);
        for (int cartao = 0; cartao < 4; cartao++) {
            String numerosCartao = "";
            for (int numeroDoCartao = 0; numeroDoCartao < 6; numeroDoCartao++) {
                int num = (int) (Math.random() * 100);
                numerosCartao += num + " ";
            }
            JOptionPane.showMessageDialog(null, "NUMEROS DO CARTAO: " + cartao + "\n" + numerosCartao);
        }
        System.exit(1);
    }
}
