package jlab.topic1;

/**
 * Created by anadata on 11/6/16.
 */
public class CourseManagement {

    public static void  main(String[] args)
    {
        int studentId = 1;
        char studentType = 'F';

        Student student = new Student();

        student.setStudentId(studentId);
        student.setStudentType(studentType);

        System.out.println(student.getStudentId());
        System.out.println(student.getStudentType());
    }
}
