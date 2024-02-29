import java.util.Scanner;

public class JPA04 {
    public static void main(String[] args) {
        Scanner numberinput = new Scanner(System.in);
        System.out.println("Input：");
        int number = numberinput.nextInt();
        if (number % 5 == 0 && number % 9 == 0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        numberinput.close();
    }
}