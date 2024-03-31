package exercicios;
import javax.swing.*;
public class EstruturaIf
{
    public static void main (String[] args)
    {
        Object[] opcao = {"Masculino", "Feminino", "Outros"};
        String resposta = (String) JOptionPane.showInputDialog(null,
                "Selecione o sexo:\n", "Pesquisa", JOptionPane.QUESTION_MESSAGE,
                null, opcao, "Masculino");
        if (resposta == null)
        {
            JOptionPane.showMessageDialog(null, "Você pressionou Cancel");
        }
        if (resposta == "Masculino")
        {
            JOptionPane.showMessageDialog(null, "Você escolheu masculino");
        }
        if (resposta == "Feminino")
        {
            JOptionPane.showMessageDialog(null, "Vocẽ selecionou mulher");
        }
        System.exit(0);
    }
}
