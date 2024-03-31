package exercicios;

import javax.swing.*;

public class GetMessageEPrintStackTrace
{
    public static void main (String[] args) {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número inteiro: "));
        try {
            int numero2 = numero1 / 0;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }
    }
}
