import java.util.Scanner;

public class JP202 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();
        if(100 >= score && score >= 0){
            if(score > 60){
            System.out.printf("%d" , score + 10);
            }
            else{
                System.out.printf("%d" , score + 5);
            }
        }
        else{
            System.out.println("error");
        }
        input.close();
    }
}