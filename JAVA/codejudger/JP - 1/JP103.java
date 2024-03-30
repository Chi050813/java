import java.util.Scanner;

public class JP103 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        System.out.printf("%d+%d+%d=%d\n" , number1, number2, number3 , number1 + number2 + number3);
        System.out.printf("%.2f" , (float)(number1 + number2 + number3) / 3);
        input.close();
    }
}