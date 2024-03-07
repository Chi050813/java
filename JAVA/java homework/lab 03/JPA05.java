import java.util.Scanner;

public class JPA05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        for(int i = 1; i < 4; i++){
            System.out.print("Please enter one value: ");
            int number = input.nextInt();
            if(10 >= number && number >= 1){
                int total = 1;
                for (int j = 1; j < number + 1; j++){
                    total *= j;
                }
            System.out.printf("%d! : %d", number , total);
            }
            else{
                System.out.print("Error, the value is out of range.\n");
            }
        }
        input.close();
    }
}
