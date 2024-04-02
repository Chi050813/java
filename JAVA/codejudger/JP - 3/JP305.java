import java.util.Scanner;

public class JP305 {
    public static void main(String[] args){
        int[] number = {0 , 0 , 0};
        Scanner input = new Scanner(System.in);
        for(int i = 0; i <= 2; i++){
            number[i] = input.nextInt();
        }
        compute(number);
        input.close();
    }
    public static void compute(int[] number){
        if(number[1] == 1){
            System.out.printf("%d" , number[0] + number[2]);
        }
        else if(number[1] == 2){
            System.out.printf("%d" , number[0] * number[2]);
        }
    }
}