import java.util.Scanner;

public class JP110 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        if(100 > number1 && number1 >= 60){
            System.out.printf("%d\n" , 1);
        }
        else{
            System.out.printf("%d\n" , 0);
        }
        System.out.printf("%.2f\n" , (float)(number2 + 1 )/10);
        if(number1 > number3){
            System.out.printf("%d\n" , number1);
        }
        else{
            System.out.printf("%d\n" , number3);
        }
        input.close();
    }
}