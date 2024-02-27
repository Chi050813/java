public class JPA106 {
    public static double function(double number){
        return 3 * (Math.pow(number , 3)) + 2 * number - 1 ;
    }
    public static void main(String[] args){
        System.out.printf("f<-3.2> = %.4f\n" , function(-3.2));
        System.out.printf("f<-2.1> = %.4f\n" , function(-2.1));
        System.out.printf("f<0> = %.4f\n" , function(0));
        System.out.printf("f<2.1> = %.4f" , function(2.1));
    }
}
