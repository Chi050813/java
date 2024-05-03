import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class JP706 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            int num = scanner.nextInt();
            numbers.add(num);
        }
        scanner.close();
        // 读取 read.txt 文件中的整数
        List<Integer> fileNumbers = readFile("read.txt");
        // 合并并排序列表
        List<Integer> mergedNumbers = new ArrayList<>(numbers);
        mergedNumbers.addAll(fileNumbers);
        Collections.sort(mergedNumbers);
        // 将排序后的结果写入 write.txt 文件中
        writeFile("write.txt", mergedNumbers);
    }
    // 从文件中读取整数并返回列表
    private static List<Integer> readFile(String fileName) {
        List<Integer> numbers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                numbers.add(Integer.parseInt(line.trim()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numbers;
    }
    // 将整数列表写入文件
    private static void writeFile(String fileName, List<Integer> numbers) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Integer num : numbers) {
                writer.write(num.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}