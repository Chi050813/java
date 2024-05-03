import java.util.Scanner;

public class JP408 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String str2 = input.nextLine();
        input.close();
        if (str1.length() < 4 || str1.length() > 20 || str2.length() < 4 || str2.length() > 20) {
            System.out.println("error");
            return;
        }
        System.out.println(str1.length());
        System.out.println(str2.length());
        String combined = str1 + str2;
        StringBuilder reversed = new StringBuilder(combined).reverse();
        System.out.println(reversed.toString());
    }
}