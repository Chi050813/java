import java.util.Scanner;

public class JP310 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        compute(number);
        input.close();
    }
    public static int compute(int number){
        int total = 0;
        int percentnumber = 0;
        for(int i = 1; i <= number; i++){
            int digits = 0;
            int powertotal = 0;
            int idivisionten = i;
            digits = String.valueOf(i).length();
            for(int j = 1; j <= digits; j++){
                percentnumber = idivisionten % 10;
                powertotal += Math.pow(percentnumber , digits);
                idivisionten /= 10;
            }
            if(powertotal == i){
                total += powertotal;
                System.out.printf("%d\n" , i);
            }
        }
        System.out.printf("%d" , total);
        return 0;
    }
}