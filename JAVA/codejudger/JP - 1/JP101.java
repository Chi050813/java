import java.util.Scanner;

public class JP101 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.printf("%d" , number + 9);
        input.close();
    }
}