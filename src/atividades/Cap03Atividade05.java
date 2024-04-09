package atividades;

import javax.swing.*;

public class Cap03Atividade05 {
    public static void main (String[] args) {
        try {
            String entrada = JOptionPane.showInputDialog(null,
                    "1 - Exercício 1\n" +
                    "2 - Exercício 2\n" +
                    "3 - Exercício 3\n" +
                    "4 - Exercício 4\n");
            int opcao = Integer.parseInt(entrada.toString());
            if (opcao < 1 || opcao > 4){
                throw new Exception("Opção inválida");
            }
            switch (opcao){
                case 1: Cap03Atividade01.main(null); break;
                case 2: Cap03Atividade02.main(null); break;
                case 3: Cap03Atividade03.main(null); break;
                case 4: Cap03Atividade04.main(null); break;
                default: System.exit (0);
            }
            System.exit (0);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Encerrando a Operação.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor inserido é inválido: " + e);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
}
