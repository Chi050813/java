import java.util.Scanner;

public class JP508 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String number1 = input.nextLine();
        String number2 = input.nextLine();
        String[] stringNumberFirst = number1.split("");
        String[] stringNumberSecond = number2.split("");
        int[] numberFirst = new int[8];
        int[] numberSecond = new int[8];
        for (int k = 0; k < 8; k++) {
            numberFirst[k] = Integer.parseInt(stringNumberFirst[k]);
            numberSecond[k] = Integer.parseInt(stringNumberSecond[k]);
        }
        int[] addFinal = new int[8];
        int numberFinal1 = 0;
        int numberFinal2 = 0;
        if (numberFirst[0] + numberSecond[0] != 2) {
            for (int j = 0; j < 8; j++) {
                if (numberFirst[j] == 1) {
                    numberFinal1 += Math.pow(2, (7 - j));
                }
                if (numberSecond[j] == 1) {
                    numberFinal2 += Math.pow(2, (7 - j));
                }
            }
            System.out.printf("%d + %d = %d\n", numberFinal1, numberFinal2, (numberFinal1 + numberFinal2));
            int carry = 0;
            for (int i = 7; i >= 0; i--) {
                int sum = numberFirst[i] + numberSecond[i] + carry;
                addFinal[i] = sum % 2;
                carry = sum / 2;
            }
            for (int i = 0; i < 8; i++) {
                System.out.print(addFinal[i]);
            }
        } else {
            for (int j = 0; j < 8; j++) {
                if (numberFirst[j] == 1) {
                    numberFinal1 += Math.pow(2, (7 - j));
                }
                if (numberSecond[j] == 1) {
                    numberFinal2 += Math.pow(2, (7 - j));
                }
            }
            System.out.printf("%d + %d = %d\n", numberFinal1, numberFinal2, (numberFinal1 + numberFinal2));
            System.out.println("11111111");
        }
        input.close();
    }
}