import java.util.Scanner;

public class JPA103 {
    public static void main(String[] args) {
      System.out.println("Please input:");

      Scanner number = new Scanner(System.in);
      Float number1 = number.nextFloat();
      Float number2 = number.nextFloat();
      Float number3 = number.nextFloat();
      System.out.printf("Average: " + "%4.2f" , ((number1 + number2 + number3) / 3));
      number.close();
    }
}
