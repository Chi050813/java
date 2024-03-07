import java.util.Scanner;

public class JPA06 {
    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        while(true){
            System.out.println("Input：");
            double m = number.nextInt();
            double n = number.nextInt();
            if (m != 999){
                System.out.printf("%.0f\n" , Math.pow(m , n));
            }
            else{
                break;
            }
        }
        number.close();
    }
}
