import java.util.Scanner;

public class JPA03 {
    public static void main(String[] args){
        Scanner numberinput = new Scanner(System.in);
        int count = 0;
        while(count != 2){
            System.out.println("Input an integer：");
            int number = numberinput.nextInt();
            if(number % 2 == 0){
                System.out.println("The number is even.");
            }
            else{
                System.out.println("The number is odd.");
            }
            count += 1;
        }
        numberinput.close();
    }
}
