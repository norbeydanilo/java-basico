package Persona;
public class Persona {
    // Atributos de la clase
    private String nombre;
    private int edad;
    private int DNI;
    private String sexo;
    private float peso;
    private float altura;

    // constructores
    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, int dNI, String sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = dNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    // getter setter
    public int getDNI() {
        return DNI;
    }

    public void setDNI(int dNI) {
        this.DNI = dNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    // ;c
    public float calcularIMC(float peso, float altura) {
        float IMC = peso / (altura * altura);
        if (IMC < 20) {
            return -1;
        } else if (IMC >= 20 && IMC <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean esMayorDeEdad(int edad) {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public String comprobarSexo(String sexo) {
        if (sexo.equals("M") || sexo.equals("H")) {
            return sexo;
        } else {
            return "H";
        }
    }

    public String toString() {
        return "Nombre: " + nombre +
                "\nEdad: " + edad +
                "\nDNI: " + DNI +
                "\nSexo: " + sexo +
                "\nPeso: " + peso +
                "\nAltura: " + altura;
    }

    public void generarDNI() {
        this.DNI = (int) (Math.random() * 90000000) + 10000000;
    }

}
