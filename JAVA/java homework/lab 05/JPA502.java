import java.util.Scanner;

public class JPA502 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("Input n ( 0 <= n <= 16 ):" );
            int number = input.nextInt();
            if(number != 999){
                int answer = 1;
                for (int i = 1; i <= number; i++) {
                    answer *= i;
                }
                System.out.printf("%d的階乘(遞迴) = %d\n", number , answer);
                System.out.printf("%d的階乘(尾遞迴) = %d\n" , number , facTail(number , 1));
            }
            else{
                input.close();
                break;
            }
        }
    }
    public static int facTail(int number , int result) {
        if(number == 0 || number == 1){
            return result;
        }
        else{
            return facTail((number - 1) , (number * result));
        }
    }
}
