package exercicios;

import javax.swing.*;

public class EstruturaSwitchCaseResumida
{
    public static void main (String[] args)
    {
        String mes = JOptionPane.showInputDialog(null, "Informe o número de um mês");
        if (mes != null) {
            try {
                int numeroMes = Integer.parseInt(mes);
                mes = switch (numeroMes) {
                    case 1 -> "Janeiro";
                    case 2 -> "Fevereiro";
                    case 3 -> "Março";
                    case 4 -> "Abril";
                    case 5 -> "Maio";
                    case 6 -> "Junho";
                    case 7 -> "Julho";
                    case 8 -> "Agosto";
                    case 9 -> "Setembro";
                    case 10 -> "Outubro";
                    case 11 -> "Novembro";
                    case 12 -> "Dezembro";
                    default -> "Não existe este mês";
                };
                JOptionPane.showMessageDialog(null, mes);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite apenas números inteiros " + e);
            }
        }
    }
}
