import java.util.Scanner;

public class JPA105 {
    public static void main(String[] args){
        Scanner nameinput = new Scanner(System.in);
        Scanner money = new Scanner(System.in);
        System.out.printf("請輸入您的姓名:");
        String name = nameinput.nextLine();
        System.out.println("Hi, " + name + ",請輸入您的銅板個數：");
        System.out.printf("請輸入1元的數量：");
        int money1 = money.nextInt();
        System.out.printf("請輸入5元的數量：");
        int money5 = money.nextInt();
        System.out.printf("請輸入10元的數量：");
        int money10 = money.nextInt();
        System.out.printf("請輸入50元的數量：");
        int money50 = money.nextInt();
        int moneytotal = money1 * 1 + money5 * 5 + money10 * 10 + money50 * 50;
        int moneythousand = moneytotal / 1000;
        int moneyhundred = (moneytotal % 1000) / 100;
        int moneyten = (moneytotal % 100) / 10;
        int moneyone = moneytotal % 10;
        System.out.printf("您的錢總共有：%d 千 %d 百 %d 十 %d 元" , moneythousand , moneyhundred , moneyten, moneyone);
        nameinput.close();
        money.close();
    }
}