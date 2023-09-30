package Task2_LtTheoMangMayTinh;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileUtils {

    // Read the content of a text file and print it to the console
    public static void readText(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName)) ) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    // Write text to the specified file
    public static void writeText(String fileName) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Dai hoc Nong Lam Tp.HCM");
            writer.newLine(); // Move to the next line
            writer.write("Khoa Cong nghe Thong tin");
            writer.newLine();
            writer.write("Thuc hanh CTDL DH18DT");
        }
    }

    public static void main(String[] args) {
        String fileName = "D:/CTDL_K22_2023/ThucHanh/Bai_Tap_Code/Bai_1/src/Task2_LtTheoMangMayTinhtest/test.txt";

        try {
            TextFileUtils.writeText(fileName);
            System.out.println("File has been written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
