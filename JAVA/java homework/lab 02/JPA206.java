import java.util.Scanner;

public class JPA206 {
    public static void main(String[] args) {
        Scanner score = new Scanner(System.in);
        for(int j = 0; j < 4 ; j++) {
            System.out.print("Input Chinese score：");
            int Chinese = score.nextInt();
            System.out.print("Input English score：");
            int English = score.nextInt();
            System.out.print("Input Math score：");
            int Math = score.nextInt();
            if (Chinese < 60){
                System.out.println("Chinese failed.");
            }
            if (English < 60){
                System.out.println("English failed.");
            }
            if (Math < 60){
                System.out.println("Math failed.");
            }
            else{
                System.out.println("All pass.");
            }
        }
        score.close();
    }
}