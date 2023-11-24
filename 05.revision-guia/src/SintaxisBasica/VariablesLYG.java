package SintaxisBasica;
/* 
Dado que JAVA es un lenguaje orientado a objetos, lo más cercano a una variable 
global son las que se declaran fuera de un método, pero dentro de una clase.

Una variable que es global se puede usar en cualquier lugar dentro de la clase.
Una variable local solo se puede usar dentro de un método y nada más.
*/
public class VariablesLYG {
    static int numero = 10; // Es una varible fuera del método main, pero dentro de la clase

    public static void main(String[] args) throws Exception {
        String palabra = "casa"; // Es una variable dentro del método main.

        System.out.println(palabra); // imprimirá casa
        System.out.println(numero); // imprime 10

        // System.out.println(i); // dará error

        imprimir();
    }

    public static void imprimir() {
        int i = 50;

        // System.out.println(palabra); // dará un error
        System.out.println(numero); // imprime 10
        System.out.println(i);
    }
}