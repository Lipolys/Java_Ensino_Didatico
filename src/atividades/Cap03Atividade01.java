package atividades;

import javax.swing.*;

public class Cap03Atividade01 {
    public static void main (String[] args) {
        try {
            String nomeProduto = JOptionPane.showInputDialog(null, "Insira o nome do produto: ");
            nomeProduto = nomeProduto.toString();
            String valorString = JOptionPane.showInputDialog(null, "Insira o valor da compra: ");
            double valorDouble = Double.parseDouble(valorString);
            double desconto;
            if (valorDouble <= 0) {
                throw new Exception("Valor inválido");
            } else if (valorDouble <= 50) {
                desconto = 0;
            } else if (valorDouble >= 50 && valorDouble < 200) {
                desconto = (double) 5 / 100;
            } else if (valorDouble >= 200 && valorDouble < 500) {
                desconto = (double) 6 / 100;
            } else if (valorDouble >= 500 && valorDouble < 1000) {
                desconto = (double) 7 / 100;
            } else {
                desconto = (double) 8 / 100;
            }

            desconto = valorDouble * desconto;
            double novoValor = valorDouble - desconto;
            JOptionPane.showMessageDialog(null, "ITEM: " + nomeProduto + "\nVALOR ORIGINAL: R$" + valorDouble + "\nDESCONTO: R$"
                                          + desconto + "\nVALOR FINAL: R$" + novoValor);
            System.exit(0);
        }catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Encerrando a Operação");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na execução: " + e.getMessage());
        }
    }
}
