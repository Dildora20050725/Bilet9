import java.util.Scanner;

public class Top2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n sonini kiriting:");
        int n = scanner.nextInt();
        int original = n, reversed = 0;

        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }

        if (original == reversed) {
            System.out.println("Palindrom");
        } else {
            System.out.println("Palindrom emas");
        }
    }
}
