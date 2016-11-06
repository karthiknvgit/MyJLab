package jlab.topic1;

import java.util.Date;
import java.util.Random;

/**
 * Created by anadata on 11/6/16.
 */
public class VariablesDemo {

    char Gender;
    float Allowances ;
    double BasicSalary ;

    final int age  =21;
    public VariablesDemo()
    {
        Gender = 'F';
        Allowances = 230f;
        BasicSalary = 100000;
    }

    public   static void main(String[] args)
    {
        int n1, n2, n3 = 0;

        Random rnd = new Random();
        n1 = rnd.nextInt(100);
        n2 = rnd.nextInt(100);

        System.out.println(n1);
        System.out.println(n2);

        VariablesDemo vd = new VariablesDemo();
        System.out.println(vd.Gender);
        System.out.println(vd.Allowances);
        System.out.println(vd.Gender);

        System.out.println(vd.age);

        double billAmount = 123.49;
        int discount    = 12;
        billAmount = billAmount - (billAmount *(discount / 100));

        System.out.println(billAmount);
    }
}
