import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromFile {

    public static void main(String[] args)
    {
        File studentFile = new File("students.csv");
        if (studentFile.exists())
        {
            //create a Scanner to read the file
            try {
                Scanner fileScanner = new Scanner(studentFile);

                while(fileScanner.hasNext())
                {
                    String studentInfo = fileScanner.nextLine();
                    String[] parsedInfo = studentInfo.split(",");

                    System.out.printf("Student #: %-8s first name: %-11s last name: %-11s%n",
                                        parsedInfo[0], parsedInfo[1],parsedInfo[2]);

                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }
        else
        {
            System.out.printf("'%s' file does not exist%n", studentFile);
        }
    }
}
