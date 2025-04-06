import java.io.*;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        File inputFile = new File("D:/LAP TRINH HUONG DOI TUONG/IOSTREAM/SRC/mau2.txt");

        try (Scanner sc = new Scanner(System.in);
             // BufferedReader in = new BufferedReader (new FileReader(inputFile));
             BufferedWriter out = new BufferedWriter(new FileWriter(inputFile))
        ) {
            String line = sc.nextLine();
            while (true) {

                if ( line.equalsIgnoreCase("e")) {
                    break;
                }
                out.write(line);
                out.newLine();
            }
            System.out.println("ghi thanh cong vao: "+inputFile.getAbsolutePath());
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
