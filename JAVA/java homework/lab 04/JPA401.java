import java.util.Scanner;

public class JPA401 {
    public static void main(String[] args){
        Scanner numberinput = new Scanner(System.in);
        int[] number = new int[10];
        int count = 0;
        int sum = 0;
        System.out.println("請輸入10個整數:");
        for (int i = 0; i <10; i++){
            System.out.printf("第%d個整數:" , i + 1);
            number[i] = numberinput.nextInt();
            if (number[i] > 60){
                count++;
                sum += number[i];
            }
        }
        System.out.printf("陣列中大於60的有%d個\n" , count);
        System.out.printf("總合為%d\n" , sum);
        System.out.printf("平均值為%f", (sum / (double) count));
        numberinput.close();
    }
}
