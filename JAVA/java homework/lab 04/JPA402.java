import java.util.Scanner;

public class JPA402 {
    public static void main(String[] args) {
        float sum = 0;
        float score[] = new float[5];
        Scanner input = new Scanner(System.in);
        System.out.print("請輸入學生人數:");
        int peoples = input.nextInt();
        for (int i = 0; i < peoples; i++) {
            System.out.printf("第%d個學生成績:" , i + 1);
            score[i] = input.nextFloat();
            sum += score[i];
        }
        System.out.printf("人數:%d\n" , peoples);
        System.out.printf("總分:%.2f\n" , sum);
        System.out.printf("平均:%f" , (sum / (double)peoples));
        input.close();
    }
}
