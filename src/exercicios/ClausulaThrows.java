package exercicios;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ClausulaThrows
{
    public static void main (String[] args) throws IOException
    {
        String frase = JOptionPane.showInputDialog(null, "Insira uma nova frase: ");
        try
        {
            FileWriter file = new FileWriter("/home/lipolys/Documentos/Arquivos/Codigos e Faculdade/Java_Ensino_Didatico/temp/temp.txt", true);
            PrintWriter out = new PrintWriter(file);
            out.println(frase);
            file.close();
            out.close();
            JOptionPane.showMessageDialog(null, "Frase armazenada no arquivo!");
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e + "Verifique se a pasta existe");
        }
    }
}
