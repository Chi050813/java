import java.util.Scanner;

public class JPA102 {
    public static void main(String[] args) {
      Scanner number = new Scanner(System.in); 
      System.out.println("Please input:");
      float kgs = number.nextFloat();
      System.out.println(kgs + " kg = " + kgs * 2.20462 + " ponds");
      number.close();
    }
  }