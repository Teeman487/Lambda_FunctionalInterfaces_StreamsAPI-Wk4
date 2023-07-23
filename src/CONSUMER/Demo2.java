package CONSUMER;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee
{
    String enname;
    int salary;
    String gender;

    Employee(String enname, int salary, String gender) {
        this.enname = enname;
        this.salary = salary;
        this.gender = gender;
    }
}
public class Demo2 {
    public static void main(String[] args) {

        ArrayList<Employee> emplist= new ArrayList<Employee>();
        emplist.add(new Employee("David", 50000, "Male"));
        emplist.add(new Employee("John", 30000, "Male"));
        emplist.add(new Employee("David", 20000, "Female"));
        emplist.add(new Employee("Scott", 60000, "Male"));

        //Function
        Function<Employee,Integer> f = emp->(emp.salary*10)/100;  // task1 -- bonus salary

        //Predicate
        Predicate<Integer> p = b->b>=5000;  // task2

        //Consumer
        Consumer<Employee> c =emp->{
            System.out.println(emp.enname);
            System.out.println(emp.salary);
            System.out.println(emp.gender);
        };  // task3
        for (Employee e:emplist)
        {
            int bonus = f.apply(e);  //calculate bonus // bonus is 5000,3000,2000,6000

           if(p.test(bonus))   // Invoked consumer
           {
              c.accept(e);  // Invoked consumer or print c
               System.out.println("Employee bonus:" + bonus);



        }

        }


    }
}
