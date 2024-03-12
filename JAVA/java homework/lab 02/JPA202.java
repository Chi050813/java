import java.util.Scanner;

public class JPA202{
    public static void main(String[] args){
        Scanner numberinput = new Scanner(System.in);
        for(int i=0; i < 2; i++){
            System.out.println("Input：");
            int number1 = numberinput.nextInt();
            int number2 = numberinput.nextInt();
            System.out.printf("%d is large than %d\n" , Math.max(number1, number2) , Math.min(number1, number2));
        }
        numberinput.close();
    }
}