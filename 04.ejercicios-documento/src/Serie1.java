public class Serie1 {
    public static void main(String[] args) {
        int n = 5; // Valor límite
        int sumatorio = 0;
        for (int i = n; i >= 1; i--) {
            sumatorio += i;
        }
        System.out.println("El sumatorio es: " + sumatorio);
    }
}