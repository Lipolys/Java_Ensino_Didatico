package exercicios;

public class MetodoValueOf {
    public static void main (String[] args){
        int a = 1000;
        long b = 8461548;
        float c = 20.1546f;
        double d = 498456.84645;
        String x = String.valueOf(a) + " " + String.valueOf(b) + " " + String.valueOf(c) + " " + String.valueOf(d);
        System.out.println(x);
    }
}
