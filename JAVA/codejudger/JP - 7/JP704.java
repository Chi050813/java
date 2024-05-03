import java.util.Scanner;
import java.util.Arrays;

public class JP704 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. 让使用者先输入要输入多少个数字
        System.out.print("请输入要输入多少个数字: ");
        int n = input.nextInt();

        // 2. 重复第1点所得数字次数去输入数字
        System.out.println("请输入" + n + "个数字:");
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }

        // 对输入的数字进行排序
        Arrays.sort(numbers);

        // 3. 统计输入的所有数字的重复次数
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

        // 最后一个数字的检查
        if (count > n / 2) {
            System.out.println(numbers[n - 1]);
            found = true;
        }

        // 如果没有找到超过一半的数字
        if (!found) {
            System.out.println("error");
        }

        input.close();
    }
}
