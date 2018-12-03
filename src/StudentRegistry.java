import java.util.ArrayList;

public class StudentRegistry {
    ArrayList<Student> students;

    /**
     * The constructor will initialize the ArrayList and allocation
     * system resources for a StudentRegistry object
     */
    public StudentRegistry()
    {
        students = new ArrayList<>();
    }

    public void addStudent(Student newStudent)
    {
        students.add(newStudent);
    }


}
