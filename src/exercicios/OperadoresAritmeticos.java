package exercicios;
public class OperadoresAritmeticos
{
    public static void main (String[] args)
    {
        //Declaração e inicialização de variável
        int X = 10;
        int Y = 3;
        //Operações com as variáveis
        System.out.println ("X = " + X);
        System.out.println ("Y = " + Y);
        System.out.println ("-X = " + (-X));
        System.out.println ("X/Y = " + (X / Y));
        System.out.println ("Resto de X por Y = " + (X % Y));
        System.out.println ("Inteiro de X por Y = " + (int) (X / Y)); //A IDE aponta redundância neste cast
        System.out.println ("X + 1 = " + (++X));
        System.out.println ("X + 1 = " + (X++)); //Perceber que ++X incrementou a variável antes da execução
        //enquanto X++ incrementou após
    }
}
