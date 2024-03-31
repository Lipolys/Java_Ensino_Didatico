package exercicios;

import javax.swing.*;

public class EstruturaIfElse
{
    public static void main (String[] args)
    {
        String resposta = JOptionPane.showInputDialog(null, "Digite uma data do mês");
        if (resposta != null) {
            try {
                int data = Integer.parseInt(resposta);
                if (data >= 1 && data <= 31) {
                    JOptionPane.showMessageDialog(null, "Data válida!!!\n" + data);
                } else {
                    JOptionPane.showMessageDialog(null, "Data inválida!!!\n" + data);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite somente números inteiros\n" + e);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Operação cancelada");
        }
        System.exit(0);
    }
}
