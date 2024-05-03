import java.util.Scanner;

public class JP404 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                count[ch - 'a']++;
            }
        }
        char maxChar = 'a';
        int maxCount = count[0];
        for (int i = 1; i < count.length; i++) {
            if (count[i] > maxCount) {
                maxChar = (char) ('a' + i);
                maxCount = count[i];
            }
        }
        System.out.println(maxChar);
        System.out.println(maxCount);
        input.close();
    }
}