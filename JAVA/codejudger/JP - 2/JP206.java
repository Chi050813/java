import java.util.Scanner;

public class JP206 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int total = 0;
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        for(int i = number1; i <= number2; i++){
            if(i % 2 == 1){
                total += i;
            }
        }
        System.out.println(total);
        input.close();
    }
}