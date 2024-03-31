package exercicios;

import javax.swing.*;
import java.io.IOException;

public class ClausulaThrow
{
    public static void main (String[] args) throws IOException
    {
        try
        {
            int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira sua idade:"));
            if (idade < 18) {
                throw new Exception("Menor de idade.\n Acesso negado!");
            } else {
                JOptionPane.showMessageDialog(null, "Acesso liberado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        System.exit(0);
    }
}
