public class Main {
    public static void main(String[] args) {
        // Ejemplo de tipos de datos
        int entero = 10;
        double decimal = 20.95;
        char caracter = 'a';
        boolean booleano = true;
        String cadena = "Hola Mundo";

        // Salidas
        System.out.println("Entero: " + entero);
        System.out.println("Decimal: " + decimal);
        System.out.println("Caracter: " + caracter);
        System.out.println("Booleano: " + booleano);
        System.out.println("Cadena: " + cadena);

        // Ejemplo de casting
        int enteroDesdeDecimal = (int) decimal;
        System.out.println("Entero desde decimal: " + enteroDesdeDecimal);

        // Ejemplo de arreglo
        int[] arreglo = { 1, 2, 3, 4, 5 };

        // Ejemplo de recorrido de arreglo
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Elemento en índice " + i + ": " + arreglo[i]);
        }

        // Ejemplo de try-catch
        try {
            int division = entero / 0;
            System.out.println("La división es: " + division);
        } catch (ArithmeticException e) {
            System.out.println("Ocurrió un error al dividir: " + e.getMessage());
        }
    }
}
