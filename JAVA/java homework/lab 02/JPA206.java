import java.util.Scanner;

public class JPA206 {
    public static void main(String[] args) {
        int i = 0;
        Scanner score = new Scanner(System.in);
        int count = 0;
        while(count != 4){
            System.out.print("Input Chinese score：");
            int Chinese = score.nextInt();
            System.out.print("Input English score：");
            int English = score.nextInt();
            System.out.print("Input Math score：");
            int Math = score.nextInt();
            if (Chinese < 60){
                System.out.println("Chinese failed.");
                i += 1;
            }
            if (English < 60){
                System.out.println("English failed.");
                i += 1;
            }
            if (Math < 60){
                System.out.println("Math failed.");
                i += 1;
            }
            if (i ==  0) {
                System.out.println("All pass.");
            }
            count += 1;
        }
        score.close();
    }
}