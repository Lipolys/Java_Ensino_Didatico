package atividades;

import javax.swing.*;
//	Faça uma classe que apresente em tela a tabuada de qualquer número. O usuário fornece o nú- mero desejado e a classe apresenta a relação de todos os cálculos de 1 a 10.
public class Cap03Atividade04 {
    public static void main (String[] args){
        try {
            int fator;
            do {
                String entrada = (JOptionPane.showInputDialog(null, "Insira um valor inteiro de 1 a 10: "));
                fator = Integer.parseInt(entrada.toString());
            } while (fator < 1 || fator > 10);
            JOptionPane.showMessageDialog(null, fator + " x 1 = " + (fator * 1) + "\n" +
                                                                        fator + " x 2 = " + (fator * 2) + "\n" +
                                                                        fator + " x 3 = " + (fator * 3) + "\n" +
                                                                        fator + " x 4 = " + (fator * 4) + "\n" +
                                                                        fator + " x 5 = " + (fator * 5) + "\n" +
                                                                        fator + " x 6 = " + (fator * 6) + "\n" +
                                                                        fator + " x 7 = " + (fator * 7) + "\n" +
                                                                        fator + " x 8 = " + (fator * 8) + "\n" +
                                                                        fator + " x 9 = " + (fator * 9) + "\n" +
                                                                        fator + " x 10 = " + (fator * 10));
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Encerrando a Operação.");
        } catch (NumberFormatException e ) {
            JOptionPane.showMessageDialog(null, "Valor inserido é inválido: " + e);
        }
    }
}
