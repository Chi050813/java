import java.util.Scanner;

public class JPA503 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.print("Input m :");
            int number1 = input.nextInt();
            if(number1 != 999){
                int min = 0;
                System.out.print("Input n :");
                int number2 = input.nextInt();
                for(int i = 1; i <= Math.min(number1, number2); i++){
                    if(number1 % i == 0 && number2 % i == 0){
                        min = i;
                    }
                }
                System.out.printf("最大公因數=%d\n" , min);
            }
            else{
                input.close();
                break;
            }
        }
    }
}
