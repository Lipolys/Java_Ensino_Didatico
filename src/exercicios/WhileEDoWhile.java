package exercicios;

import javax.swing.*;

public class WhileEDoWhile{
    public static void main (String[] args){
        try {
            int limite = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número inteiro: "));
            int contador = limite;
            while (contador >= 0) {
                System.out.println(contador);
                contador--;
            }
            System.out.println("Fim do laço de repetição");
            do {
                System.out.println(contador);
                contador++;
            } while (contador <= limite); //Em java, caso positivo, permanecer no laço, independente do tipo da repetição
        } catch (NumberFormatException e){
            System.out.println("Não foi fornecido um número válido!\n" + e.toString());
        }
        System.exit(0);
    }
}
