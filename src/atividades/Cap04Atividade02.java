package atividades;

import javax.swing.*;
import java.text.DecimalFormat;

public class Cap04Atividade02 {
    public static void main (String[] args) {
        try {
            double valor;
            valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor original do produto"));
            while (valor > 0) {
                valor = Math.round(valor + (valor * ((double) 12 /100)));
                DecimalFormat dc = new DecimalFormat();
                dc.applyPattern("R$ #,##0.00");
                JOptionPane.showMessageDialog(null, "Novo valor 12% mais caro: " + dc.format(valor));
                valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor original do produto"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ocorreu: " + e);
        }
    }
}
