import java.util.Scanner;

public class JP308 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numberinput = input.nextInt();
        compute(numberinput);
        input.close();
    }
    public static void compute(int numberinput) {
        int[] number = {0 , 1 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0};
        for(int j = 2; j <= 9; j++){
            number[j] = number[j - 1] + number[j - 2];
        }
        for (int i = numberinput; i > 0; i--){
                System.out.printf("fib(%d)=%d\n" , i , number[i]);
        }
    }
}