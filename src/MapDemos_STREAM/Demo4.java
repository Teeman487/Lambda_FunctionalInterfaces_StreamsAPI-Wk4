package MapDemos_STREAM;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee
{
    int empid;
    String empname;
    int salary;

    public Employee(int empid, String empname, int salary) {
        this.empid = empid;
        this.empname = empname;
        this.salary = salary;
    }

    public int getEmpid() {
        return empid;
    }

    public String getEmpname() {
        return empname;
    }

    public int getSalary() {
        return salary;
    }
}
public class Demo4 {
    public static void main(String[] args) {
       /* List<Employee> employeesList=new ArrayList<Employee>();
        employeesList.add(new Employee(101,"Alex", 1000));
        employeesList.add(new Employee(101,"Alex", 1000));
        employeesList.add(new Employee(101,"Alex", 1000));
        employeesList.add(new Employee(101,"Alex", 1000));*/
        List<Employee> employeesList = Arrays.asList(
                new Employee(101,"Alex", 10000),
                new Employee(102,"Brian", 20000),
                new Employee(103,"Charles", 30000),
                new Employee(104,"David", 40000),
        new Employee(101,"Edward", 50000)
        );
        //Combination of filter and map // Sequence: First filter the data(in list) and Add it to Map(operation) and collection
                                         //   Collection --> stream ---> Filter--->map ---> collect
        List<Integer> employeeSalList=employeesList.stream()
                .filter(e->e.salary >20000) // filter salary based on condition >20000, then(store to list collection) where map will make use of to perform certain operation
                .map(e->e.salary).limit(2)
                .collect(Collectors.toList());
        System.out.println(employeeSalList); // [30000, 40000, 50000]
    }
}
