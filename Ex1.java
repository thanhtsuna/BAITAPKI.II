import java.io.*;

public class Ex1 {

    public static void main(String[] args) {
            File inputFile = new File("D:/LAP TRINH HUONG DOI TUONG/IOSTREAM/SRC/1.1.cpp");
            File outpoutFile = new File("D:/LAP TRINH HUONG DOI TUONG/IOSTREAM/SRC/mau2.txt");

        try (BufferedReader in = new BufferedReader(new FileReader(inputFile));
             BufferedWriter out = new BufferedWriter(new FileWriter(outpoutFile))
        ) {
            String line;
            while((line = in.readLine()) != null){
                out.write(line);
                out.newLine();
            }
            System.out.println("copy thanh cong vao: "+outpoutFile.getAbsolutePath());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
