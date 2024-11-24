import java.util.Scanner;

public class Top6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("String kiriting:");
        String input = scanner.nextLine();

        int maxBlock = 0, currentBlock = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                currentBlock++;
            } else {
                maxBlock = Math.max(maxBlock, currentBlock);
                currentBlock = 1;
            }
        }

        maxBlock = Math.max(maxBlock, currentBlock);
        System.out.println("Eng uzun blok uzunligi: " + maxBlock);
    }
}
