package exercicios;

import javax.swing.*;

public class EstruturaSwitchCase
{
    public static void main (String[] args)
    {
        String mes = JOptionPane.showInputDialog(null, "Informe o número de um mês");
        if (mes != null)
        {
            try {
                int numeroMes = Integer.parseInt(mes);
                switch (numeroMes)
                {
                    case 1 :
                        mes = "Janeiro"; break;
                    case 2 :
                        mes = "Fevereiro"; break;
                    case 3 :
                        mes = "Março"; break;
                    case 4 :
                        mes = "Abril"; break;
                    case 5 :
                        mes = "Maio"; break;
                    case 6 :
                        mes = "Junho"; break;
                    case 7 :
                        mes = "Julho"; break;
                    case 8 :
                        mes = "Agosto"; break;
                    case 9 :
                        mes = "Setembro"; break;
                    case 10 :
                        mes = "Outubro"; break;
                    case 11 :
                        mes = "Novembro"; break;
                    case 12 :
                        mes = "Dezembro"; break;
                    default :
                        mes = "Não existe este mês";  break;
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
