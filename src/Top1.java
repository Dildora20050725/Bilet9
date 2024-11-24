import java.util.Scanner;

public class Top1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("3 ta string kiriting:");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();

        String longest = str1.length() >= str2.length() ? (str1.length() >= str3.length() ? str1 : str3) : (str2.length() >= str3.length() ? str2 : str3);
        System.out.println("Eng uzun string: " + longest);
    }
}

