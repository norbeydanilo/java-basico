public class Main {
    public static void main(String[] args) {
        // Sentencia if
        int a = 5;
        if (a > 0) {
            System.out.println("a es positivo");
        }

        // Sentencia else-if
        int b = -5;
        if (b > 0) {
            System.out.println("b es positivo");
        } else if (b < 0) {
            System.out.println("b es negativo");
        }

        // Sentencia switch
        int c = 2;
        switch (c) {
            case 1:
                System.out.println("c es uno");
                break;
            case 2:
                System.out.println("c es dos");
                break;
            default:
                System.out.println("c no es ni uno ni dos");
        }

        // Sentencia while
        int d = 0;
        while (d < 5) {
            System.out.println(d + " es menor que 5");
            d++;
        }

        // Sentencia do-while
        int e = 0;
        do {
            System.out.println(e + " es menor que 5");
            e++;
        } while (e < 5);

        // Sentencia for
        for (int i = 0; i < 5; i++) {
            System.out.println("i es " + i);
        }

        // Sentencia continue y break
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue; // Salta a la siguiente iteración
            }
            System.out.println("i es " + i);
            if (i == 5) {
                break; // Termina el bucle
            }
        }

        // Sentencia for each
        int[] array = { 1, 2, 3, 4, 5 };
        for (int num : array) {
            System.out.println("num es " + num);
        }

        // Uso de operadores lógicos, relaciones y aritméticos
        int f = 5;
        int g = 10;
        if (f < g && g > 0) {
            double h = f + g;
            double p = (double) f / g; // int/int = double
            System.out.println("h es " + h); // 15
            System.out.println("p es " + p); //
        }
    }
}
