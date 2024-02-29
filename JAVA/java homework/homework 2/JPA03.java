import java.util.Scanner;

public class JPA03 {
    public static void main(String[] args){
        Scanner numberinput = new Scanner(System.in);
        System.out.println("Input：");
        int number = numberinput.nextInt();
        if(number % 2 == 0){
            System.out.println("The number is even.");
        }
        else{
            System.out.println("The number is odd.");
        }
        numberinput.close();
    }
}
