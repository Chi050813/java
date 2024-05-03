import java.util.Scanner;

public class JP406 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            char transformedChar = transformChar(ch);
            output.append(transformedChar);
        }
        System.out.println(output.toString());
        scanner.close();
    }
    public static char transformChar(char ch) {
        String[] keyboardRows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        if (Character.isLetter(ch)) {
            for (String row : keyboardRows) {
                int index = row.indexOf(Character.toLowerCase(ch));
                if (index != -1 && index < row.length() - 1) {
                    char rightChar = row.charAt(index + 1);
                    if (Character.isUpperCase(ch)) {
                        return Character.toUpperCase(rightChar);
                    } else {
                        return rightChar;
                    }
                }
            }
        }
        return ch;
    }
}