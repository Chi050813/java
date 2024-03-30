import java.util.Scanner;

public class JP208 {
    public static void main(String[] args){
        int i , j = 0;
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for (i = 2; i < number; i++) {
            for (j = 2; j < i; j++) {
                if (i % j == 0)
                    break;
            }
            if (j >= i)
                System.out.printf("%d " , j);
        }
        input.close();
    }
}