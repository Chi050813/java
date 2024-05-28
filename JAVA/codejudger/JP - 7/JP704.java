import java.util.Scanner;
import java.util.Arrays;

public class JP704 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }
        Arrays.sort(numbers);
        int count = 1;
        boolean found = false;
        for (int i = 1; i < n; i++) {
            if (numbers[i] == numbers[i - 1]) {
                count++;
            } else {
                if (count > n / 2) {
                    System.out.println(numbers[i - 1]);
                    found = true;
                }
                count = 1;
            }
        }
        if (count > n / 2) {
            System.out.println(numbers[n - 1]);
            found = true;
        }
        if (!found) {
            System.out.println("error");
        }
        input.close();
    }
}