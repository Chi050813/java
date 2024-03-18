import java.util.Scanner;

public class JPA406 {
    public static void main(String[] args) {
        Scanner numberinput = new Scanner(System.in);
        int price[] = {30 , 30 , 50 , 50 , 80 , 80};
        int hour[] = {2 , 3 , 5 , 8};
        for (int i = 0; i < hour.length; i++) {
            int finalprice = 0;
            System.out.printf("停車時數：%d小時\n" , hour[i]);
            for (int j = 0; j < hour[i]; j++) {
                if (j < price.length){
                    finalprice += price[j];
                }
                else{
                    finalprice += 100;
                }
            }
            System.out.printf("應繳費用:%d元整\n" , finalprice);
            System.out.println("--------------------");
        }
        numberinput.close();
    }
}