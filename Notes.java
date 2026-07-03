import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String fileName = "notes.txt";

        while (true) {

            System.out.println("\n===== NOTES APP =====");
            System.out.println("1. Add Note");
            System.out.println("2. View Notes");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter your note: ");
                    String note = sc.nextLine();

                    try {
                        FileWriter writer = new FileWriter(fileName, true);
                        writer.write(note + "\n");
                        writer.close();
                        System.out.println("Note saved successfully!");
                    } catch (IOException e) {
                        System.out.println("Error saving note.");
                    }
                    break;

                case 2:
                    try {
                        File file = new File(fileName);

                        if (!file.exists()) {
                            System.out.println("No notes found.");
                            break;
                        }

                        BufferedReader reader = new BufferedReader(new FileReader(file));

                        String line;
                        System.out.println("\n----- Saved Notes -----");

                        while ((line = reader.readLine()) != null) {
                            System.out.println(line);
                        }

                        reader.close();

                    } catch (IOException e) {
                        System.out.println("Error reading notes.");
                    }
                    break;

                case 3:
                    System.out.println("Thank You!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}