import java.util.Scanner;

public class SplitArray {
    public static void main(String[] args)
    {
        System.out.print("Enter student info: ");
        Scanner keyboard = new Scanner(System.in);
        String studentInfo = keyboard.nextLine();

        String[] parsedInfo = studentInfo.split(",");

        for (String element:parsedInfo)
            System.out.printf("'%s'%n",element.trim());
    }
}
