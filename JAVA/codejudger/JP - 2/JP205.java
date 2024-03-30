import java.util.Scanner;

public class JP205 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        int number4 = 0;
        int number5 = 0;
        int number6 = 0;
        int error = 0;
        for (int i = 0; i < 10; i++){
            int numberinput = input.nextInt();
            if (numberinput == 1){
                number1 += 1;
            }
            else if (numberinput == 2){
                number2 += 1;
            }
            else if (numberinput == 3){
                number3 += 1;
            }
            else if (numberinput == 4){
                number4 += 1;
            }
            else if (numberinput == 5){
                number5 += 1;
            }
            else if (numberinput == 6){
                number6 += 1;
            }
            else {
                error += 1;
            }
        }
        System.out.printf("number1:%d\nnumber2:%d\nnumber3:%d\nnumber4:%d\nnumber5:%d\nnumber6:%d\nerror:%d" , number1 , number2 , number3 , number4 , number5 , number6 , error);
        input.close();
    }
}