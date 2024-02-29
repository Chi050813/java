import java.util.Scanner;

public class JPA08 {
    public static void main(String[] args){
        Scanner scoreinput = new Scanner(System.in);
        System.out.println("Input：");
        int score = scoreinput.nextInt();
        if (score >= 90){
            System.out.println("Your grade is A");
        }
        else if (90 > score  && score >= 80){
            System.out.println("Your grade is B");
        }
        else if (80 > score && score >= 70){
            System.out.println("Your grade is C");
        }
        else if (70 > score && score >= 60){
            System.out.println("Your grade is D");
        }
        else {
            System.out.println("Your grade is F");
        }
        scoreinput.close();
    }
}
