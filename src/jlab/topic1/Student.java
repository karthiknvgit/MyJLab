package jlab.topic1;

/**
 * Created by anadata on 11/6/16.
 */
public class Student {

    private int studentId;
    private char studentType;

    private static int studentCount​;
    static
    {
        studentCount​ = 10;
    }

    public Student()
    {
        studentCount​ += 1;
        studentId = studentCount​;
    }


    public static int getStudentCount​()
    {
        return studentCount​;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public char getStudentType() {
        return studentType;
    }

    public void setStudentType(char studentType) {
        this.studentType = studentType;
    }
}
