import java.util.Scanner;

public class JP105 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        System.out.printf("result=%.2f" , (double)Math.sqrt(number1 + number2));
        input.close();
    }
}