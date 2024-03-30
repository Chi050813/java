import java.util.Scanner;

public class JP106 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        System.out.printf("%.2f" , (double)Math.sqrt(Math.pow(x2 - x1 , 2) + Math.pow(y2 - y1 , 2)));
        input.close();
    }
}