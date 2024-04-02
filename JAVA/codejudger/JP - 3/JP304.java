import java.util.Scanner;

public class JP304 {
    public static void main(String[] args){
        int[] numbers = {0 , 0 , 0 , 0 , 0 , 0};
        Scanner input = new Scanner(System.in);
        for(int i = 0; i <6; i++){
            numbers[i] = input.nextInt();
        }
        compute(numbers);
        input.close();
    }
    public static void compute(int[] numbers){
        int count = 0;
        for(int i = 0; i <= 5; i++){
            if(numbers[i] %3 == 0){
                count += 1;
            }
            else{
                continue;
            }
        }
        System.out.printf("%d" , count);
    }
}