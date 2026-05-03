
public class Main {
    public static void main(String[] args) {

        int numero1 = 5;
        int numero2 = 3;

        int resultado = sumar(numero1, numero2);

        System.out.println("El resultado es: " + resultado); // Imprime: El resultado es: 8
    }

    public static int sumar(int a, int b) {
        return a + b;

    }
}