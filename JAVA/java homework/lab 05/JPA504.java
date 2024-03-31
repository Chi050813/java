import java.util.Scanner;

public class JPA504 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number :" );
        int number = input.nextInt();
        if(number >= 1){
            System.out.printf("Ans:%d\n" , sum2(number));
            input.close();
        }
    }
    public static int sum2(int number){
        int sum = 0;
        if(number == 1){
            return 2;
        }
        else{
            sum += sum2(number - 1) + (2 * number);
            return sum;
        }
    }
}