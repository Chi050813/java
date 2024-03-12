import java.util.Scanner;

public class JPA203 {
    public static void main(String[] args){
        Scanner numberinput = new Scanner(System.in);
        for(int i = 0; i < 2 ; i++){
            System.out.println("Input an integer：");
            int number = numberinput.nextInt();
            if(number % 2 == 0){
                System.out.println("The number is even.");
            }
            else{
                System.out.println("The number is odd.");
            }
        }
        numberinput.close();
    }
}
