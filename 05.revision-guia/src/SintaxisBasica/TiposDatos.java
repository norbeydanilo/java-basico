package SintaxisBasica;
/* 
JAVA tiene varios tipos de datos nativos, dentro de los que se encuentran
    * Numéricos enteros
        - int
        - byte
        - short
        - long
    * Numéricos con coma
        - float
        - double
    * Booleanos
        - boolean
    * Caracteres
        - char
    * Objetos
        - String
        - Vectores
        - Clases propias
        - Clases de JAVA
*/
public class TiposDatos {

    public static void main(String[] args) throws Exception {

        byte diasMes = 31; // Aproximadamente
        short diasLustro = (12 * 31) * 5;
        int velocidadLuz = 299792458;
        long añoLuz = velocidadLuz * 365;

        final float PI = 3.1415926535f;
        double e = 2.718281828459045235360;

        char letraA = 'a';
        char letraANumerico = 61;

        boolean verdadero = true;
        boolean falso = false;

        System.out.println(PI);
        System.out.println(e);
        System.out.println(letraA);
        System.out.println(letraANumerico);
        System.out.println(verdadero);
        System.out.println(falso);
        System.out.println(diasMes);
        System.out.println(diasLustro);
        System.out.println(añoLuz);
    }
}
