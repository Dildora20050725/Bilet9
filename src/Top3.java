import java.util.Scanner;

public class Top3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n sonini kiriting:");
        int n = scanner.nextInt();
        System.out.println(n + " ta son kiriting:");

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num > max) max = num;
            if (num < min) min = num;
        }

        double ratio = (double) max / min;
        System.out.printf("Katta va kichik sonlarning nisbati: %.2f%n", ratio);
    }
}
