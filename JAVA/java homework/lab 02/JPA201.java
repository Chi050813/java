import java.util.Scanner;

public class JPA201{
    public static void main(String[] args){
        Scanner scoreinput = new Scanner (System.in);
        for(int i=0; i < 2 ; i++){
            System.out.println("Please enter score：");
            int score = scoreinput.nextInt();
            if (score >= 60){
                System.out.println("You pass");
                System.out.println("End");
            }
            else{
                System.out.println("End");
            }
        }
        scoreinput.close();
    }
}