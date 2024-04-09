package exercicios;

import javax.swing.*;

public class MetodosMath {
    public static void main (String[] args){
        double valorA = 2.4, valorB = 3.8, valorC = 4, valorD = -1;
        String resultados = "Arredondamento de " + valorA + " = " + Math.round(valorA)
                            + "\nArredondamento de " + valorB + " = " + Math.round(valorB)
                            + "\nMaior valor entre" + valorA + " e " + valorB + " = " + Math.max(valorA, valorB)
                            + "\nMenor valor entre" + valorA + " e " + valorB + " = " + Math.min(valorA, valorB)
                            + "\nQuadrado de " + valorC + " = " + Math.pow(valorC, 2)
                            + "\nRaíz quadrada de " + valorC + " = " + Math.sqrt(valorC)
                            + "\nMódulo de " + valorD + " = " + Math.abs(valorD);
        JOptionPane.showMessageDialog(null, resultados);
        System.exit(1);
    }
}
