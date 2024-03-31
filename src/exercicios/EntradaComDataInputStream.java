package exercicios;
import java.io.*;
public class EntradaComDataInputStream
{
    public static void main (String[] args)
    {
        String s1;
        float largura, comprimento, area, perimetro;
        DataInputStream dado;
        try {
            System.out.println ("Entre com o comprimento"); //Lá ele infinito
            dado = new DataInputStream(System.in);
            s1 = dado.readLine(); //deprecated
            comprimento = Float.parseFloat (s1);

            System.out.println ("Entre com a largura"); //... '-'
            dado = new DataInputStream(System.in);
            s1 = dado.readLine(); //deprecated
            largura = Float.parseFloat (s1);

            area = comprimento * largura;
            perimetro = comprimento * 2 + largura * 2;
            System.out.println ("Área do retângulo: " + area);
            System.out.println ("Perimetro do retângulo: " + perimetro);
        } catch (IOException erro) {
            System.out.println("Houve um erro na entrada de dados: " + erro.toString());
        } catch (NumberFormatException erro) {
            System.out.println("Houve um erro na conversão. Digite somente caracteres numéricos: " + erro.toString());
        }
    }
}
