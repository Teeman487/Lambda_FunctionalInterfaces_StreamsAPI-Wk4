package Lambda_Expression_Predicate2;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee
{
    String ename;
    int salary;
    int experience;

    // Constructor
    Employee(String name, int sal, int exp) {
        ename = name;
        salary = sal;
        experience = exp;
    }
}
public class Demo2 {
    public static void main(String[] args) {
        //Ex1
        Employee emp = new Employee("john",50000,5);
      //My condition: emp object --- return name if sal>30k exp >3
        Predicate<Employee> pr = e->e.salary>30000 && e.experience>3; // takes in one arg, and 1 boolean result will be return
        //System.out.println(pr.test(emp)); // true

        //Ex2:
        ArrayList<Employee> al = new ArrayList<>();

        al.add(new Employee("john",50000,5));
        al.add(new Employee("David",20000,2));
        al.add(new Employee("Scott",30000,3));
        al.add(new Employee("Scott",40000,6));

        for (Employee e:al) // Employee reps data type
        {
            if (pr.test(e))
            {
                System.out.println(e.ename+ " "+e.salary); // john 50000 Scott 40000
            }

        }
    }
}

/*
* Predicate<Employee> pr = e->{
            int sal =e.salary;
            if(sal>10000 && sal<=20000)
                return true; // 10 perc
            else if (sal>20000 && sal<=30000)
                return true; // 20 perc
            else if(sal>30000 && sal<=50000)
                return true; // 30 perc  50000 *(3/10)
            else
                return false; // 40 perc
        };
*
*
*
*
*
* */
