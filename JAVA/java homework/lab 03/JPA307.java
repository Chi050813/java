import java.util.Scanner;

public class JPA307 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        while(true){
            int max = 0;
            System.out.print("Input：\n");
            int m = number.nextInt();
            if(m != 999){
                int n = number.nextInt(); 
                for (int i = 1; i < Math.min(m, n) + 1; i++){
                    if(m % i == 0 && n % i == 0){
                        max = i;
                    }
                }
                System.out.printf("%d\n" , max);
            }
            else{
                break;
            }
        }
        number.close();
    }
}
