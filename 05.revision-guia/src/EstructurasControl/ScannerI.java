package EstructurasControl;
import java.util.Scanner;
/* 
Para recibir un dato por consola JAVA hace uso de la libreria Scanner, por lo que 
se instancia un objeto de esta clase y se hace la lectura por consola.
Se debe tener presente el tipo de dato que se esta ingresando por teclado.

Para imprimir se hace uso de la función System.out.println()
*/
public class ScannerI {

    public static void main(String[] args) throws Exception {
        // declaración de variables
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        // leer el primer número
        System.out.println("Introduce un número entero: ");
        n1 = sc.nextInt(); // lee un entero por teclado
        // leer el segundo número
        System.out.println("Introduce otro número entero: ");
        n2 = sc.nextInt(); // lee otro entero por teclado
        // mostrar la suma
        System.out.println("La suma es: " + (n1 + n2));
        // cerrar el objeto Scanner
        sc.close();
    }
}