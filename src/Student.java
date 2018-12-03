import java.util.HashMap;

public class Student {
    private int studentNum;
    private String firstName, lastName, phone;
    HashMap<String, Integer> grades;

    /**
     * This is the constructor, when it is called, it allocates system resources for a
     * single Student object
     * @param studentNum
     * @param firstName
     * @param lastName
     * @param phone
     */
    public Student(int studentNum, String firstName, String lastName, String phone) {
        setStudentNum(studentNum);
        setFirstName(firstName);
        setLastName(lastName);
        setPhone(phone);
        grades = new HashMap<>();
    }

    public int getStudentNum() {
        return studentNum;
    }

    /**
     *
     * @param studentNum - this must be greater than 0
     */
    public void setStudentNum(int studentNum) {
        if (studentNum > 0)
            this.studentNum = studentNum;
        else
            throw new IllegalArgumentException("Student number must be greater than 0");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.matches("[A-Z][a-z]*"))
            this.firstName = firstName;
        else
            throw new IllegalArgumentException("first name must start with a capital");

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.matches("[A-Z][a-z]*"))
            this.lastName = lastName;
        else
            throw new IllegalArgumentException("last name must start with an upper case letter");
    }

    public String getPhone() {
        return phone;
    }

    /**
     *
     * @param phone - needs to match the north american dialling plan
     */
    public void setPhone(String phone) {
        if (phone.matches("[2-9][0-9]{2}[-][2-9][0-9]{2}[-][0-9]{4}"))
            this.phone = phone;
        else
            throw new IllegalArgumentException("phone number match the north american dialing plan");
    }

    public HashMap<String, Integer> getGrades() {
        return grades;
    }

    /**
     *
     * @param courseCode - the course code (i.e. COMP1008)
     * @param grade - must be in the range 0-100
     */
    public void addGrade(String courseCode, int grade)
    {
        if (courseCode.matches("[A-Z]{4}[0-9]{4}") && grade >=0 && grade <= 100)
            grades.put(courseCode, grade);
        else
            throw new IllegalArgumentException("course must be in the pattern COMP1008," +
                    "grade must be 0-100");
    }
}
