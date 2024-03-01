public class JPA106 {
    public static double function(double number){
        System.out.printf("f<-3.2> = %.4f\n" , 3 * (Math.pow(number , 3)) + 2 * number - 1);
        return 0;
    }
    public static void main(String[] args){
        function(-3.2);
        function(-2.1);
        function(0);
        function(2.1);
    }
}