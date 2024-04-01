package atividades;

import javax.swing.*;

public class Cap03Atividade02
{
    public static void main (String[] args) {
        int maiorResistencia;
        int menorResistencia;
        try {
            int resistencia1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a 1ª resistência:"));
            int resistencia2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a 2ª resistência:"));
            int resistencia3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a 3ª resistência:"));
            int resistencia4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a 4ª resistência:"));

            int resistenciaEquivalente = resistencia1 + resistencia2 + resistencia3 + resistencia4;

            if (resistencia1 >= resistencia2 && resistencia1 >= resistencia3 && resistencia1 >= resistencia4) {
                maiorResistencia = resistencia1;
            }else if (resistencia2 >= resistencia3 && resistencia2 >= resistencia4) {
                maiorResistencia = resistencia2;
            }else if (resistencia3 >= resistencia4) {
                maiorResistencia = resistencia3;
            }else{
                maiorResistencia = resistencia4;
            }

            if (resistencia1 <= resistencia2 && resistencia1 <= resistencia3 && resistencia1 <= resistencia4) {
                menorResistencia = resistencia1;
            }else if (resistencia2 <= resistencia3 && resistencia2 <= resistencia4) {
                menorResistencia = resistencia2;
            }else if (resistencia3 <= resistencia4) {
                menorResistencia = resistencia3;
            }else{
                menorResistencia = resistencia4;
            }


            JOptionPane.showMessageDialog(null, "Resistências Fornecidas: " + resistencia1 + ", " + resistencia2 + ", " + resistencia3
                    + ", " + resistencia4 + "\nA maior resistência é: " + maiorResistencia + "\nA menor resistência é: " + menorResistencia + "\nResistencia" +
                    "equivalente: " + resistenciaEquivalente);
            System.exit(0);
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Encerrando a Operação");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na execução: " + e.getMessage());
        }
    }
}
