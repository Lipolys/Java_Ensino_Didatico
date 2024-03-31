package exercicios;

import javax.swing.*;

public class EstruturaIfResumida
{
    public static void main (String[] args)
    {
        int valor1 = 10, valor2 = 15, maior;
        if (valor1 > valor2)
            maior = valor1;
        else
            maior = valor2;
        JOptionPane.showMessageDialog(null, "Maior valor feito com IF e ELSE comum, economizando as chaves: " + maior);

        int valor3 = 10, valor4 = 8;
        maior = (valor3 > valor4) ? valor3 : valor4;
        JOptionPane.showMessageDialog(null, "Maior valor feito com IF e ELSE resumido: " + maior);

        maior = Math.max(valor4, valor2);
        JOptionPane.showMessageDialog(null, "Maior valor feito com Math.max() : " + maior);
        System.exit(0);
    }
}
