import java.util.Scanner;

public class JPA05 {
    public static void main(String[] args) {
        Scanner numberinput = new Scanner(System.in);
        System.out.println("Enter an integer：");
        int number = numberinput.nextInt();
        if (number % 6 == 0) {
            System.out.printf("%d是2、3、6的倍數" , number);
        }
        else if (number % 3 == 0) {
            System.out.printf("%d是3的倍數" , number);
        }
        else if (number % 2 == 0) {
            System.out.printf("%d是2的倍數" , number);
        }
        else{
            System.out.printf("%d不是2、3、6的倍數" , number);
        }
        numberinput.close();
    }
}