package exercicios;

import javax.swing.*;

public class MetodoSubString {
    public static void main (String[] args) {
        try {
            String frase = JOptionPane.showInputDialog(null, "Insira uma string de até 15 caracteres");
            JOptionPane.showMessageDialog(null, "Frase: " + frase
                                                                        + "\nCaractere 10 em diante: " + frase.substring(9) //Importante perceber que a sub string
                                                                        + "\nCaractere 5 a 10: " + frase.substring(4, 9)              //funciona como o |-- da estatística, ou
                                                                        + "\nCaractere 11 a 14: " + frase.substring(10, 13)           //seja, o primeiro valor até o anterior
                                                                        + "\nCaractere 2 a 4" + frase.substring(1, 3)                 //ao segundo valor (entre 1 e 4, seria
                                                                        + "\nCaractere 2 em diante: " + frase.substring(1) );//caracter 1, 2 e 3.
        } catch (StringIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "A frase precisa ter pelo menos 15 caracteres!\nERRO: " + e);
        }
        System.exit(0);
    }
}
