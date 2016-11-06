package jlab.topic1;

/**
 * Created by anadata on 11/6/16.
 */
public class PassByVal {


    public void passTheValue(int sId)
    {
        sId = 10;
        System.out.println( String.format("The sId inside the passTheValue is %1$d", sId ));
    }

    public void passTheValue(Student student)
    {
        student.setStudentId(10);
        System.out.println( String.format("The sId inside the passTheValue is %1$d", student.getStudentId() ));
    }

    public static void main(String[] args)
    {
        PassByVal pval = new PassByVal();
        //pval.passTheValue(20);

        Student stu = new Student();
        stu.setStudentId(20);
        pval.passTheValue(stu);
        System.out.println( String.format("The sId inside the Main is %1$d", stu.getStudentId() ));
    }

}
