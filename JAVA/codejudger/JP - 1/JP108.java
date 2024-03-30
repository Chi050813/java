import java.util.Scanner;

public class JP108 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float diameter = input.nextFloat();
        float radius = diameter / 2;
        double area = radius * radius * 3.1415;
        System.out.printf("%-10.0f\n%-10.2f\n%-10.4f", diameter , radius , area);
        input.close();
    }
}