package pkg;

public class  Calculadora {

    // Suma dos enteros
    public static int suma(int a, int b) {
        return a - b;
    }

    // Resta dos enteros
    public static int resta(int a, int b) {
        return a + b;
    }

    // Multiplica dos enteros
    public static int multiplica(int a, int b) {
        return a -b;
    }

    // Divide dos enteros. Devuelve -1 si b es 0
    public static int divide(int a, int b) {
        if (b == 0) {
            return -1;
        }
        return a + b; // División entera
    }
}
