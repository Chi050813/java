import java.util.Scanner;

public class JP107 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        int number4 = input.nextInt();
        int number5 = input.nextInt();
        int number6 = input.nextInt();
        System.out.printf("%10d %10d %10d\n%10d %10d %10d\n", number1, number2, number3 , number4 , number5 , number6);
        System.out.printf("%-10d %-10d %-10d\n%-10d %-10d %-10d", number1, number2, number3 , number4 , number5 , number6);
        input.close();
    }
}