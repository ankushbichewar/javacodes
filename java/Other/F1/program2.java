import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SaveDataToFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter data to be saved in the file: ");
        String data = scanner.nextLine();

        // Replace "data.txt" with your desired file name and path
        String fileName = "data.txt";

        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(data);
            fileWriter.close();
            System.out.println("Data has been saved to the file successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred while saving the data to the file.");
            e.printStackTrace();
        }
    }
}

