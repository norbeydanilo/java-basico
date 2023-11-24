package EstructurasControl;
import java.util.*;

public class Ciclos {

    public static void main(String[] args) throws Exception {
        /*
         * CICLO WHILE
         * Las instrucciones se repiten mientras la condición sea cierta.
         * En un ciclo while la condición se comprueba al principio
         * 
         * instrucción 1;
         * while (condición){ //inicio while
         * 
         * instrucciones;
         * 
         * } //fin while
         * 
         * instrucción 2;
         */
        Scanner sc = new Scanner(System.in);
        int num; // variable que contiene el número introducido
        int suma = 0; // variable donde acumularemos la suma de los números

        System.out.print("Introduzca un número ( < 0 para finalizar): ");
        num = sc.nextInt(); // lectura del primer número

        while (num >= 0) { // inicio del bucle while
            suma = suma + num; // se suma el número introducido
            System.out.print("Introduzca un número ( < 0 para finalizar): ");
            num = sc.nextInt(); // lectura del siguiente número
        } // fin del bucle while
        System.out.println("La suma es: " + suma); // se muestra la suma

        /*
         * CICLO DO - WHILE
         * Las instrucciones se ejecutan mientras la condición sea cierta.
         * La condición se comprueba al final del bucle por lo que el bloque
         * de instrucciones se ejecutarán al menos una vez.
         * 
         * instrucción1;
         * do{ //inicio do .. while
         * instrucciones;
         * }while(condición); //fin do .. while
         * instrucción2;
         */
        int valor;
        do { // inicio del do .. while
            System.out.print("Introduce un número entero <= 100: ");
            valor = sc.nextInt();
            if (valor > 100) {
                System.out.println("Número no válido");
            }
        } while (valor > 100); // fin del do .. while
        System.out.println("Ha introducido: " + valor);

        /*
         * CICLO FOR
         * Un for hace que una instrucción o bloque de instrucciones se repitan
         * un número determinado de veces mientras se cumpla la condición.
         * 
         * instrucción1;
         * for(inicialización; condición; incremento/decremento){ //inicio for
         * 
         * instrucciones;
         * 
         * } //fin for
         * 
         * instrucción2;
         * 
         */
        sc.close();
        int i;
        for (i = 1; i <= 10; i++) { // inicio del for
            System.out.print(i + " ");
        } // fin del for
        System.out.println("\nFin programa");
    }
}
