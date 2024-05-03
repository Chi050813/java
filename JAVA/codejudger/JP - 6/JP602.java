import java.util.Scanner;

public class JP602{
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputstring = input.nextLine();
        String uppercaseLetters = "";
        String lowercaseLetters = "";
        int uppercaseCount = 0;
        for (int i = 0; i < inputstring.length(); i++) {
            char ch = inputstring.charAt(i);
            if (Character.isUpperCase(ch)) {
                uppercaseLetters += ch;
                uppercaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowercaseLetters += ch;
            }
        }
        System.out.println(uppercaseLetters);
        System.out.println(lowercaseLetters);
        System.out.println(uppercaseCount);
        input.close();
    }
}