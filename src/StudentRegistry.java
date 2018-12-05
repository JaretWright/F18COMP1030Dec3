import java.util.ArrayList;

public class StudentRegistry {
    private ArrayList<Student> students;

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

    public int getNumberOfStudents()
    {
        return this.students.size();
    }

    public String getStudentsString()
    {
        StringBuilder studentString = new StringBuilder();

        for (Student student:students)
        {
            studentString.append(String.format("%s%n",student));
        }

        return studentString.toString();
    }

    /**
     * To return a Student object based on the student number
     */
    public Student getStudent(int studentNum)
    {
        for (Student student:students) {
            if (student.getStudentNum() == studentNum)
                return student;
        }
        return null;
    }

}
