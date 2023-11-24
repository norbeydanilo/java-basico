public class Tabla {
    public static void main(String[] args) {
        // Definir un array
        int[] array1 = { 3, 2, 6, 8, 4 };

        // Calcular la suma de todos los elementos
        int suma1 = 0;
        for (int i = 0; i < array1.length; i++) {
            suma1 += array1[i];
        }
        System.out.println("La suma mediante for es: " + suma1);

        int suma2 = 0;
        for (int num : array1) {
            suma2 += num;
        }
        System.out.println("La suma mediante foreach es: " + suma2);
    }
}
