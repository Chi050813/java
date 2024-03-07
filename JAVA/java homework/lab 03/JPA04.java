import java.util.Scanner;

public class JPA04 {
    public static void main(String[] args){
        Scanner money = new Scanner(System.in);
        System.out.print("Please enter meal dollars or enter -1 to stop： ");
        float total = 0;
        int count = 0;
        while (money.nextFloat() != -1){
            System.out.print("Please enter meal dollars or enter -1 to stop： ");
            float cost = money.nextFloat();
            total += cost;
            count += 1;
        }
        System.out.printf("餐點費用：%.0f\n" , total);
        System.out.printf(" %d 道餐點平均費用為： %.2f" , count , total / count);
        money.close();
    }
}
