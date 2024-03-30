import java.util.Scanner;

public class JP104 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float number1 = input.nextFloat();
        float number2 = input.nextFloat();
        System.out.printf("total=%.2f" , number1 + number2);
        input.close();
    }
}
