public class exercicio16 {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3;
        System.out.print(n1 + " " + n2);

        n3 = n1 + n2;
        while (n3 <= 500) {
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
        }
    }
}
