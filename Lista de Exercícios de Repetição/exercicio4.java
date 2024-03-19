public class exercicio4 {
    public static void main(String[] args) {
        int A = 80000;
        int B = 200000;
        int i = 0;

        while (A <= B) {
            A += (int) (A * 0.03);
            B += (int) (B * 0.015);
            i++;
        }
        System.out.println("\nA população A se igualar a B demorou " + i + " anos");
    }
}
