import java.util.Scanner;

public class JP109 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int grade = input.nextInt();
        if(100 >= grade && grade >= 0){
            if(grade >= 60){
                System.out.println("pass");
            }
            else{
                System.out.println("fail");
            }
            if(grade % 2 == 0){
                System.out.println("even");
            }
            else{
                System.out.println("odd");
            }
        }
        else{
            System.out.println("error");
        }
        input.close();
    }
}