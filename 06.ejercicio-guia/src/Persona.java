import java.util.Scanner;

public class Persona {
    // Constantes
    private static final char SEXO_DEFECTO = 'H';

    // Atributos
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;

    // Constructores
    public Persona() {
        this("", 0, SEXO_DEFECTO, 0, 0);
        this.DNI = generaDNI();
    }

    public Persona(String nombre, int edad, char sexo) {
        this(nombre, edad, sexo, 0, 0);
        this.DNI = generaDNI();
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
        this.DNI = generaDNI();
    }

    // Métodos
    public int calcularIMC() {
        double imc = peso / Math.pow(altura, 2);
        if (imc < 20) {
            return -1;
        } else if (imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public String comprobacionPeso() {
        if (calcularIMC() == 0) {
            return "Normal";
        } else if (calcularIMC() == -1) {
            return "Por debajo de peso ideal";
        } else if (calcularIMC() == 1) {
            return "Sobrepeso";
        }
        return "";
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    private void comprobarSexo(char sexo) {
        if (sexo != 'H' && sexo != 'M') {
            this.sexo = SEXO_DEFECTO;
        } else {
            this.sexo = sexo;
        }
    }

    private String generaDNI() {
        final int divisor = 23;

        // Generar número de 8 cifras
        int numDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
        int res = numDNI - (numDNI / divisor * divisor);

        // Letra del DNI
        char letraDNI = generaLetraDNI(res);

        return String.valueOf(numDNI) + letraDNI;
    }

    private char generaLetraDNI(int res) {
        char letras[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
                'L', 'C', 'K', 'E' };

        return letras[res];
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI='" + DNI + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                ", IMC=" + calcularIMC() +
                ", Estado IMC=" + comprobacionPeso() +
                ", mayor de edad=" + esMayorDeEdad() +
                '}';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Introduce la edad:");
        int edad = scanner.nextInt();

        System.out.println("Introduce el sexo:");
        char sexo = scanner.next().charAt(0);

        System.out.println("Introduce el peso:");
        double peso = scanner.nextDouble();

        System.out.println("Introduce la altura:");
        double altura = scanner.nextDouble();

        scanner.close();

        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();

        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());
    }
}
