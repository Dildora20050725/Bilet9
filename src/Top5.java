import java.util.Scanner;

public class Top5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("String kiriting:");
        String input = scanner.nextLine();

        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                count++;
            }
        }

        System.out.println("Raqamlar soni: " + count);
    }
}
