import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestingStudent {
    public static void main(String[] args)
    {
//        Student student1 = new Student(10001,"Anita","Job","705-555-1234");
//        Student student2 = new Student(10002,"April","Showers","705-555-1235");
//        Student student3 = new Student(10003,"May","Flowers","705-555-1236");
//
//        ArrayList<Student> students = new ArrayList<>();
//        students.add(student1);
//        students.add(student2);
//        students.add(student3);
//
//        for (Student student:students)
//            System.out.println(student);

        StudentRegistry studentRegistry = new StudentRegistry();

        //To read from the file
        //1. create a file
        File fileToRead = new File("students.csv");

        //2. if exists, create a Scanner to read it
        if (fileToRead.exists())
        {
            try {
                Scanner fileReader = new Scanner(fileToRead);
                //3. loop over the contents of the file
                while(fileReader.hasNext())
                {
                    String studentInfo = fileReader.nextLine();
                    String[] parsedInfo = studentInfo.split(",");

                    if (!parsedInfo[0].equalsIgnoreCase("student"))
                    {
                        Student newStudent = new Student(Integer.parseInt(parsedInfo[0]),
                                parsedInfo[1],
                                parsedInfo[2],
                                parsedInfo[3]);
                        studentRegistry.addStudent(newStudent);
                    }
                }

                //4. close the Scanner
                fileReader.close();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            System.out.printf("The student registry has %d students.%n",
                                studentRegistry.getNumberOfStudents());
            System.out.print("The students in the class are:\n");
            System.out.print(studentRegistry.getStudentsString());

        }

        Student donny = studentRegistry.getStudent(10020);
        System.out.println("\n\nThe student accessed is: "+donny);

        donny.addGrade("COMP1030",97);
        donny.addGrade("COMP1008",98);
        donny.addGrade("ENGE1030",76);
        donny.addGrade("CHEM1001",82);

        System.out.printf("The average grade for Donny is %.1f%%%n",donny.getAverage());

        readInGrades();

    }

    public static void readInGrades()
    {

    }


}
