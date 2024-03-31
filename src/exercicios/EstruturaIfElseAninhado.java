package exercicios;

import javax.swing.*;

public class EstruturaIfElseAninhado
{
    public static void main (String[] args)
    {
        String mes = JOptionPane.showInputDialog(null, "Informe o número de um mês");
        if (mes != null)
        {
            try {
                int numeroMes = Integer.parseInt(mes);
                if (numeroMes == 1) {
                    mes = "Janeiro";
                } else if (numeroMes == 2) {
                    mes = "Fevereiro";
                } else if (numeroMes == 3) {
                    mes = "Março";
                } else if (numeroMes == 4) {
                    mes = "Abril";
                } else if (numeroMes == 5) {
                    mes = "Maio";
                } else if (numeroMes == 6) {
                    mes = "Junho";
                } else if (numeroMes == 7) {
                    mes = "Julho";
                } else if (numeroMes == 8) {
                    mes = "Agosto";
                } else if (numeroMes == 9) {
                    mes = "Setembro";
                } else if (numeroMes == 10) {
                    mes = "Outubro";
                } else if (numeroMes == 11) {
                    mes = "Novembro";
                } else if (numeroMes == 12) {
                    mes = "Dezembro";
                } else {
                    mes = "Não existe este mês";
                }
                JOptionPane.showMessageDialog(null, mes);
            } catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Digite apenas números inteiros " + e);
            }
        }
        System.exit(0);
    }
}
