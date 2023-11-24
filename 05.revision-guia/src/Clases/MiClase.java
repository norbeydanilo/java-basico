package Clases;
/*
Una clase en Java se puede entender como un prototipo que define las variables y
los métodos comunes a un cierto tipo de instancias, una clase define todo lo que
caracteriza y pueden hacer una o varias instancias.

En Java, un objeto es básicamente una instancia de una clase
*/

// Le damos un nombre "MiClase" a la clase
public class MiClase {
    // Atributos de la clase
    private String atributo1;
    private int atributo2;
    private float atributo3;

    // Constructor con el mismo nombre de la clase
    public MiClase() {
        // Cuerpo del constructor
        this.atributo2 = 0;
        this.atributo3 = 0.0f;
        this.atributo1 = "";
    }

    // Métodos de la clase
    public void metodo1() {
        // Método vacío
    }

    @Override
    public String toString() {
        return "MiClase [atributo1=" + atributo1 + ", atributo2=" + atributo2 + ", atributo3=" + atributo3 + "]";
    }

    public String metodo2() {
        return "metodo2";
    }

    public static void main(String[] args) throws Exception {

        MiClase miObjeto; // Declaramos una variable del tipo de la clase
        miObjeto = new MiClase(); // Aquí ya hemos creado un objeto de MiClase
        // o
        MiClase $miObjeto = new MiClase(); // Declaramos y creamos el objeto en una línea

        miObjeto.metodo1();
        System.out.println($miObjeto.metodo2());
        System.out.println($miObjeto.toString());
        System.out.println(miObjeto.toString());
    }
}