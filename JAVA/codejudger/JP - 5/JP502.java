import java.util.Scanner;

public class JP502 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        String numberStr = Long.toString(number);
        for (int i = 0; i < numberStr.length(); i++) {
            int digit = Character.getNumericValue(numberStr.charAt(i));
            System.out.printf("%d", digit);
            if (i < numberStr.length() - 1) {
                System.out.print("*");
            }
        }
        long result = multiplyDigits(number);
        System.out.printf("=%d\n", result);

        scanner.close();
    }
    private static long multiplyDigits(long number) {
        if (number == 0) {
            return 0;
        }
        long result = 1;
        while (number != 0) {
            result *= number % 10;
            number /= 10;
        }
        return result;
    }
}