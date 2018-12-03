import java.util.HashMap;

public class Student {
    private int studentNum;
    private String firstName, lastName, phone;
    HashMap<String, Integer> grades;

    public Student(int studentNum, String firstName, String lastName, String phone) {
        setStudentNum(studentNum);
        setFirstName(firstName);
        setLastName(lastName);
        setPhone(phone);
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public HashMap<String, Integer> getGrades() {
        return grades;
    }

    public void setGrades(HashMap<String, Integer> grades) {
        this.grades = grades;
    }
}
