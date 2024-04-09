package exercicios;

import javax.swing.*;

public class MetodoCeil {
    public static void main (String[] args) {
        final float LOTACAO_ONIBUS = 50;
        int numeroPassageiros = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade de passageiros: "));
        float quantidadeOnibus = numeroPassageiros / LOTACAO_ONIBUS;
        JOptionPane.showMessageDialog(null,
                "Quantidade de passageiros: " + numeroPassageiros
                + "\nQuantidade de ônibus: " + (int) Math.ceil(quantidadeOnibus));
        System.exit(1);
    }
}
