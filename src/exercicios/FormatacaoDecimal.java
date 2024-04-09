package exercicios;

import java.text.DecimalFormat;

public class FormatacaoDecimal {
    public static void main (String[] args){
        DecimalFormat formatacao = new DecimalFormat();
        short idade = 38;
        formatacao.applyPattern ("000");
        System.out.println(formatacao.format(idade));
        int quantidade = 9750;
        formatacao.applyPattern ("#0,000");
        System.out.println(formatacao.format(quantidade));
        long estoque = 198564;
        formatacao.applyPattern("#,##0,000");
        System.out.println(formatacao.format(estoque));
        float altura = 1.74f;
        formatacao.applyPattern ("#0.00");
        System.out.println(formatacao.format(altura));
        double peso = 70.25;
        formatacao.applyPattern ("#0.00");
        System.out.println(formatacao.format(peso));
        String valorEmReais = "2583.75";
        formatacao.applyPattern ("RS #,##0.00");
        System.out.println(formatacao.format(Double.parseDouble (valorEmReais)));

    }
}
