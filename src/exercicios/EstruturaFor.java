package exercicios;

public class EstruturaFor // <Inicialização da Variável; Caso verdadeiro, continuar; Incremento da variável de controle>
{
    public static void main (String[] args) {
        for (int i = 0; i < 10; i++){
            System.out.print(i + ", ");
        }
        System.out.println("Acabou!");
        for (int i = 0; i < 10; ++i){
            System.out.print(i + ", ");
        }
        System.out.println("Acabou!");
        for (int i = 10; i > 0; i--){
            System.out.print(i + ", ");
        }
        System.out.println("Acabou!");
        for (int i = 10; i > 0; --i){
            System.out.print(i + ", ");
        }
        System.out.println("Acabou!");

        for (int horas = 0; horas < 24; horas++){
            for (int minutos = 0; minutos < 60; minutos++){
                for (int segundos = 0; segundos < 60; segundos++){
                    System.out.println(horas + ":" + minutos + ":" + segundos);
                    try {
                        Thread.sleep (1000);
                        if (segundos == 10){
                            System.exit (0);
                        }
                    } catch (Exception e) {
                        e.getMessage();
                    }
                }
            }
        }
    }
}
