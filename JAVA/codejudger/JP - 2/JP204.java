import java.util.Scanner;

public class JP204 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        String symbol = input.next();
        if(symbol.equals("+")){
            System.out.printf("%d%s%d=%d" , number1 , symbol , number2 , (number1 + number2));
        }
        else if(symbol.equals("-")){
            System.out.printf("%d%s%d=%d" , number1 , symbol , number2 , (number1 - number2));
        }
        else if(symbol.equals("*")){
            System.out.printf("%d%s%d=%d" , number1 , symbol , number2 , (number1 * number2));
        }
        else{
            System.out.println("error");
        }
        input.close();
    }
}