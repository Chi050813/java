import java.util.Scanner;

public class JP307 {
    public static void main(String[] args){
        int[] number = {0 , 0 , 0 , 0 , 0};
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            number[i] = input.nextInt();
        }
        System.out.printf("%d" , compute(number));
        input.close();
    }
    public static int compute(int[] number){
        int max = 0;
        for (int j = 0; j < 4; j++){
            if(Math.max(number[j] , number[j + 1]) > max){
                max = Math.max(number[j], number[j + 1]);
            }
        }
        return max;
    }
}