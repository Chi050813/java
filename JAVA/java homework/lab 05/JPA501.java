import java.util.Scanner;

public class JPA501 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.print("Input n (0<=n<=16):");
            int number = input.nextInt();
            if(number == 0){
                System.out.printf("%d的階乘 = %d\n", number , 1);
            }
            else if (number != 999){
                int answer = 1;//乘法需要最低為1
                for (int i = 1; i <= number; i++) {
                    answer *= i;
                }
                System.out.printf("%d的階乘 = %d\n", number , answer);
            }
            else{
                input.close();
                break;
            }
        }
    }
}