public class JPA405 {
    public static void main(String[] args) {
        String english[] = {"A" , "B" , "C" , "D" , "E" , "F" , "G" , "H" , "I" , "J"};
        System.out.printf("反轉陣列資料之前:");
        for (int i = 0; i < english.length; i++) {
            System.out.printf("%2s" , english[i]);
        }
        System.out.printf("\n");
        System.out.printf("反轉陣列資料之後:");
        for (int i = 0; i < english.length; i++) {
            System.out.printf("%2s" , english[9 - i]);
        }
    }
}
