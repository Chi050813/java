public class JPA506 {
    public static void main(String[] args) {
        System.out.printf("圓形面積為:%.6f\n" , calCircle(5 , 3.1415926));
        System.out.printf("三角形面積為:%.6f\n" , calTriangle(10 , 5));
        System.out.printf("長方形面積為:%d\n" , calRectangle(5 , 10));
        System.out.printf("此圖形面積為:%.6f\n" , calCircle(5 , 3.1415926) + calTriangle(10 , 5) + calRectangle(5 , 10));
    }
    public static double calCircle(float radius , double PI){
        return radius * radius * PI;
    }
    public static float calTriangle(float high , float ground){
        return high * ground / 2;
    }
    public static int calRectangle(int length , int width){
        return length * width;
    }
}
