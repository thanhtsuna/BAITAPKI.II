import java.io.*;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        String fileName = "1.1.cpp";

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập vào các số nguyên, nhập -1 để kết thúc:");
            while (true) {
                int number = scanner.nextInt();
                if (number == -1) break;
                dos.writeInt(number);
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi file: " + e.getMessage());
        }

        System.out.println("Các số đã ghi vào file:");
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            while (true) {
                int number = dis.readInt();
                System.out.print(number + " ");
            }
        } catch (EOFException e) {
            System.out.println("\nĐọc xong file!");
        } catch (IOException e) {
            System.out.println( e.getMessage());
        }
    }
}
