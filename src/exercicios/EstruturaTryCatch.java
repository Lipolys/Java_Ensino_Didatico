package exercicios;

import javax.swing.*;

public class EstruturaTryCatch
{
    public static void main (String[] args)
    {
        try
        {
            ImpOperacao op = new ImpOperacao(); //Instanciamento de um objeto ImpOperacao
            String valor1 = JOptionPane.showInputDialog(null, "Insira o valor do 1º número");
            int num1 = Integer.parseInt(valor1.toString());
            String valor2 = JOptionPane.showInputDialog(null, "Insira o valor do 2º número");
            int num2 = Integer.parseInt(valor2.toString());
            JOptionPane.showMessageDialog(null, "SOMA: " + op.soma.executar(num1, num2)); //Execução do cálculo
            JOptionPane.showMessageDialog(null, "SUBTRAÇÃO: " + op.subt.executar(num1, num2));
            JOptionPane.showMessageDialog(null, "MULTIPLICAÇÃO: " + op.mult.executar(num1, num2));
            JOptionPane.showMessageDialog(null, "DIVISÃO: " + op.divi.executar(num1, num2));
        } catch (ArithmeticException e)
        {
            JOptionPane.showMessageDialog(null, "Erro de divisão por zero!\n: " + e, "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Erro de conversão!\n" + e, "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Tecla 'cancel' pressionada\n" + e, "Cancelado pelo usuário", JOptionPane.ERROR_MESSAGE);
        } finally {
            JOptionPane.showMessageDialog(null, "Encerrando Operação");
        }
        System.exit(0);
    }
}

interface Operacao //Criação da interface Operacao, ou seja, um rótulo que será usado para outras classes serem identificadas
{
    int executar (int a, int b); //Método que executa as operações
}

class ImpOperacao //criação da classe ImpOperacao, que não implementa propriamente dizendo a interface Operacao, mas possui dentro de si
                  //variáveis funcionais para operacões
{
    Operacao soma = (int a, int b) -> a + b; //Variável funcional, ou seja, variável que realiza uma função por operações lambda
    Operacao subt = (int a, int b) -> a - b;
    Operacao mult = (int a, int b) -> a * b;
    Operacao divi = (int a, int b) -> a / b;

}