import java.io.File;

public class Ex5 {
    public static void main(String[] args) {
        String folderPath = "1.1.cpp";
        File folder = new File(folderPath);

        if (folder.exists() && folder.isDirectory()) {
            File[] listOfFiles = folder.listFiles();
            System.out.println("Danh sách các file trong thư mục:");
            for (File file : listOfFiles) {
                if (file.isFile()) {
                    System.out.println("File: " + file.getName());
                } else if (file.isDirectory()) {
                    System.out.println("Thư mục con: " + file.getName());
                }
            }
        } else {
            System.out.println("Thư mục không tồn tại!");
        }
    }
}
