package exercicios;

import javax.swing.*;

public class MetodoCharAt {
    public static void main (String[] args){
        String palavra = JOptionPane.showInputDialog(null, "Insira uma palavra de 4 caracteres: ");
        JOptionPane.showMessageDialog(null, "Caractere 1: " + palavra.charAt(0)
                                                                    +"\nCaractere 2: " + palavra.charAt(1)
                                                                    +"\nCaractere 3: " + palavra.charAt(2)
                                                                    +"\nCaractere 4: " + palavra.charAt(3));
        System.exit(0);
    }
}
