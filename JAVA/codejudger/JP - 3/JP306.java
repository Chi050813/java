import java.util.Scanner;

public class JP306 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        compute(number);
        input.close();
    }
    public static void compute(int number){
        int answer = 1;
        if(number == 0){
            System.out.printf("%d" , 1);
        }
        else{
            for(int i = 1; i <= number; i++){
                answer *= i;
            }
            System.out.printf("%d!=%d" , number, answer);
        }
    }
}