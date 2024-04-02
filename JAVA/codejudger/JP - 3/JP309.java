import java.util.Scanner;

public class JP309 {
    public static void main(String[] args){
        double[] number = {0 , 0 , 0 , 0 , 0 , 0};
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 6; i++){
            number[i] = input.nextDouble();
        }
        System.out.printf("%.3f" , compute(number));
        input.close();
    }
    public static double compute(double[] number){
        double min = 0;
        double[] division = {0 , 0 , 0};
        for (int i = 0; i < 3; i++){
            division[i] = number[i] / number[i + 3];
        }
        min = division[0];
        for (int j = 0; j < 2; j++){
            if(Math.min(division[j], division[j + 1]) < min){
                min = Math.min(division[j], division[j + 1]);
            }
        }
        return min;
    }
}