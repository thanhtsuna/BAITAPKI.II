import java.io.*;

public class Ex3 {
    public static void main(String[] args) {
        String fileName = "1.1.cpp";
        int lineCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while (br.readLine() != null) {
                lineCount++;
            }
            System.out.println("Số dòng trong file: " + lineCount);
        } catch (IOException e) {
            System.out.println( e.getMessage());
        }
    }
}
