import java.util.Scanner;

public class JPA204 {
    public static void main(String[] args) {
        Scanner numberinput = new Scanner(System.in);
        int count = 0;
        while(count != 2){
            System.out.println("Input：");
            int number = numberinput.nextInt();
            if (number % 5 == 0 && number % 9 == 0) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
            count += 1;
        }
        numberinput.close();
    }
}