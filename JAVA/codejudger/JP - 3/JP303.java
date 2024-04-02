import java.util.Scanner;

public class JP303 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        compute(number);
        input.close();
    }
    public static void compute(int number){
        for(int i = 1; i <= number; i++){
            if(i == 1){
                continue;
            }
            else if (i == number){
                System.out.println(number + " is a prime number");
            }
            else if(number % i == 0){
                System.out.println(number + " is not a prime number");
                break;
            }
        }
    }
}