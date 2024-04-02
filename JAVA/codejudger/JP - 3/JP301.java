import java.util.Scanner;

public class JP301 {
    public static void main(String[] args){
        int[] number = {0 , 0};
        Scanner input = new Scanner(System.in);
        for(int i = 0; i <= 1; i++){
            number[i] = input.nextInt();
        }
        compute(number);
        input.close();
    }
    public static void compute(int[] array){
        for(int i = 0; i < array[1]; i++){
            for(int j = 1; j <= array[0]; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.printf("%d" , array[0] * array[1]);
    }
}