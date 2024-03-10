import java.util.Scanner;

public class JPA201{
    public static void main(String[] args){
        Scanner scoreinput = new Scanner (System.in);
        int count = 0;
        while (count != 2){
            System.out.println("Please enter score：");
            int score = scoreinput.nextInt();
            if (score >= 60){
                System.out.println("You pass");
                System.out.println("End");
            }
            else{
                System.out.println("End");
            }
            count += 1;
        }
        scoreinput.close();
    }
}