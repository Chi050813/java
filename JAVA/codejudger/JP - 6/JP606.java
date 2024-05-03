import java.util.Scanner;

public class JP606 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String studentID = input.nextLine();
            int s0 = studentID.charAt(0) - '0';
            int s1 = studentID.charAt(1) - '0';
            int s2 = studentID.charAt(2) - '0';
            int s3 = studentID.charAt(3) - '0';
            int s4 = studentID.charAt(4) - '0';
            int checkSum = ((s0 + s2 + s4) + (s1 + s3) * 5) % 26;
            char expectedCheckCode = (char) ('A' + checkSum);
            char actualCheckCode = studentID.charAt(5);

            if (actualCheckCode == expectedCheckCode - 1) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }
        }
        input.close();
    }
}