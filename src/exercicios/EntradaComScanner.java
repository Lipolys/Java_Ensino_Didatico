package exercicios;
import java.util.*;

public class EntradaComScanner
{
    public static void main (String[] args)
    {
        float largura, comprimento, area, perimetro;
        Scanner sc;
        try {
            System.out.println ("Entre com o comprimento"); //Lá ele infinito
            sc = new Scanner(System.in);
            comprimento = sc.nextFloat();

            System.out.println ("Entre com o comprimento"); //Lá ele infinito
            sc = new Scanner(System.in);
            largura = sc.nextFloat();

            area = comprimento * largura;
            perimetro = comprimento * 2 + largura * 2;
            System.out.println ("Área do retângulo: " + area);
            System.out.println ("Perimetro do retângulo: " + perimetro);
        } catch (InputMismatchException erro) {
            System.out.println("Houve um erro na leitura. Digite somente caracteres numéricos: " + erro.toString());
        }
    }
}
