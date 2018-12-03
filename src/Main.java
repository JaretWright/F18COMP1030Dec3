import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.print("Enter a file or directory name: ");
        Scanner keyboard = new Scanner(System.in);
        String fileName = keyboard.nextLine();

        File file = new File(fileName);
        System.out.printf("That %s %s %n", file.isDirectory()?"directory":"file",
                                            file.exists()?"exists":"does not exist");

        if (file.isDirectory())
        {
            File[] directoryContents = file.listFiles();

            for (File element:directoryContents)
            {
                System.out.println(element);
            }
        }
    }
}
