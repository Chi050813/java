import java.util.Scanner;

public class JPA104 {
    public static void main(String[] args){
        Scanner coordinate = new Scanner(System.in);
        System.out.print("輸入第1組的x和y座標：");
        float x1 = coordinate.nextFloat();
        float y1 = coordinate.nextFloat();
        System.out.print("輸入第2組的x和y座標：");
        float x2 = coordinate.nextFloat();
        float y2 = coordinate.nextFloat();
        double distance = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        System.out.printf("介於<%.2f,%.2f>和<%.2f,%.2f>之間的距離是%.2f。\n", x1, y1, x2, y2, distance);
        coordinate.close();
    }
}