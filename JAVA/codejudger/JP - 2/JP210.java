import java.util.Scanner;

public class JP210 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int max = 0;
        int min = 0;
        for(int i = 1; i < Math.min(number1 , number2); i++){
            if(number1 % i == 0 && number2 % i == 0){
                max = i;
            }
        }
        min = max * (number1 / max) * (number2 / max);
        System.out.printf("%d\n%d" , max , min);
        input.close();
    }
}