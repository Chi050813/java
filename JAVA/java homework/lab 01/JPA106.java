public class JPA106 {
    public static double function(double number){
        System.out.printf("f<%.1f> = %.4f\n" , number , 3 * (Math.pow(number , 3)) + 2 * number - 1);
        return 0;
    }
    public static void main(String[] args){
        function(-3.2);
        function(-2.1);
        function(0);
        function(2.1);
    }
}