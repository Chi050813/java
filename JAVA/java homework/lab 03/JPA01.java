import java.util.Scanner;

public class JPA01{
    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        System.out.println("Input：");
        int numbermax = number.nextInt();
        int finalnumber = 0;
        for (int i = 1; i < numbermax + 1; i++){
                finalnumber += i;
        }
        System.out.printf("1 + ... + %d = %d" , numbermax, finalnumber);
        number.close();
    }
}