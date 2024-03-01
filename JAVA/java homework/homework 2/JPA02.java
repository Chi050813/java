import java.util.Scanner;

public class JPA02{
    public static void main(String[] args){
        Scanner numberinput = new Scanner(System.in);
        int count = 0;
        while(count != 2){
            System.out.println("Input：");
            int number1 = numberinput.nextInt();
            int number2 = numberinput.nextInt();
            System.out.printf("%d is large than %d" , Math.max(number1, number2) , Math.min(number1, number2));
            count += 1;
        }
        numberinput.close();
    }
}