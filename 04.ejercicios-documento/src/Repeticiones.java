public class Repeticiones {
    public static void main(String[] args) {
        int n = 5;

        // For
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }

        int i = 0;

        // Usando while
        while (i <= n) {
            System.out.println(i);
            i++;
        }

        i = 0;
        // Usando do-while
        do {
            System.out.println(i);
            i++;
        } while (i <= n);
    }
}
