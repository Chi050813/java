public class JPA303 {
    public static void main(String[] args){
        System.out.printf("1~1000中的完美數有：");
        for(int i = 1; i < 1001; i++){
            int add = 0;
            for(int j = 1; j < i ; j++){
                if (i % j == 0){
                    add += j;
                }
            }
            if(add == i){
                System.out.printf(" %d" , i);
                }
        }
    }
}
