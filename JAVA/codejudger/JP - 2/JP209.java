import java.util.Scanner;

public class JP209 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(number == 0){
            for(int i = 1; i <= 5; i++){
                for(int j = 1; j <= 5; j++){
                    System.out.printf("%d x %d = %d\t" , i , j , i * j);
                }
                System.out.println();
            }
        }
        else if(number == 1){
            for(int i = 1; i <= 5; i++){
                for(int j = 1; j <= 5; j++){
                    System.out.printf("%d x %d = %d\t" , j , i , i * j);
                }
                System.out.println();
            }
        }
        else{
            System.out.println("error");
        }
        input.close();
    }
}