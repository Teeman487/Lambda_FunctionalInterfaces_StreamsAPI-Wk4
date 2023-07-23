package Functions;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

// Function will take value and return result
class Employee
{
    String ename;
    int salary;

    Employee(String ename, int salary) {
        this.ename = ename;
        this.salary = salary;
    }
}
public class Demo2 {
    public static void main(String[] args) {

        ArrayList<Employee> emplist =new ArrayList<>();
        emplist.add(new Employee("David", 50000));
        emplist.add(new Employee("David", 30000));
        emplist.add(new Employee("David", 20000));

        Function<Employee,Integer> fn =e->{
            int sal =e.salary;
            if(sal>10000 && sal<=20000)
                return (sal *10/100); // 10 perc
            else if (sal>20000 && sal<=30000)
                return (sal *20/100); // 20 perc
                else if(sal>30000 && sal<=50000)
                    return (sal *30/100); // 30 perc  50000 *(3/10)
                else
                    return (sal *40/100); // 40 perc
        }; // curly bracked is used because of return // fn.apply()

        Predicate<Integer> p= b->(b>5000);

        for(Employee emp:emplist) // Reading elements
        {
           int bonus = fn.apply(emp); // 15000 , 6000, 2000
          if(p.test(bonus)) //
          {    //Predicated

                // System.out.println(emp.ename+" "+emp.salary);
                System.out.println("Bonus is:" + bonus);//David 50000 Bonus is:15000 David 30000 Bonus is:6000 David 20000 Bonus is:2000
            }



        }
    }

}
