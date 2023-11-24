package Persona;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Persona p1;

        Scanner sc = new Scanner(System.in);
        // nombre, edad, sexo, peso y altura
        String nombre;
        int edad;
        String sexo;
        float peso;
        float altura;
        System.out.println("Introduce nombre: ");
        nombre = sc.nextLine();
        System.out.println("Introduce edad: ");
        edad = sc.nextInt();
        System.out.println("Introduce sexo: ");
        sexo = sc.nextLine();
        System.out.println("Introduce peso: ");
        peso = sc.nextFloat();
        System.out.println("Introduce altura: ");
        altura = sc.nextFloat();

        p1 = new Persona(nombre, edad, sexo);
        System.out.println(p1.toString());

        p1.setAltura(altura);
        p1.setPeso(peso);

        p1.generarDNI();

        p1.setSexo(p1.comprobarSexo(sexo));

        System.out.println(p1.toString());

        if (p1.esMayorDeEdad(p1.getEdad())) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        if (p1.calcularIMC(p1.getPeso(), p1.getAltura()) == -1) {
            System.out.println("Bajo peso");
        } else if (p1.calcularIMC(p1.getPeso(), p1.getAltura()) == 0) {
            System.out.println("Peso ideal");
        } else {
            System.out.println("Sobrepeso");
        }

        sc.close();
    }
}
