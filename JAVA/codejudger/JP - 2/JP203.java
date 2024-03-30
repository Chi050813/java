import java.util.Scanner;

public class JP203 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(4 >= number && number >= 1){
            if(number == 1){
                System.out.println("one");
            }
            else if(number == 2){
                System.out.println("two");
            }
            else if(number == 3){
                System.out.println("three");
            }
            else{
                System.out.println("four");
            }
        }
        else{
            System.out.println("error");
        }
        input.close();
    }
}