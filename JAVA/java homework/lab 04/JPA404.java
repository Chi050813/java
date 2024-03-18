public class JPA404 {
    public static void main(String[] args) {
        int numbers[] = new int[10];
        numbers[0] = 0;
        numbers[1] = 1;
        for (int i = 0; i < 10; i++) {
            if (i >= 2){
                numbers[i] = numbers[i - 2] + numbers[i - 1];
                System.out.println(numbers[i]);
            }
            else{
                System.out.println(numbers[i]);
            }
        }
    }
}
