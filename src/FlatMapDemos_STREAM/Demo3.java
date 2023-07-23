package FlatMapDemos_STREAM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student
{
    String sname;
    int sid;
    char grade;

    Student(String sname, int sid, char grade) {
        this.sname = sname;
        this.sid = sid;
        this.grade = grade;
    }
}
public class Demo3 {
    public static void main(String[] args) {
        List<Student>studentList1 = new ArrayList<Student>();
        studentList1.add(new Student("Smith", 101, 'A'));
        studentList1.add(new Student("John", 102, 'B'));
        studentList1.add(new Student("Kenedy", 103, 'C'));

        List<Student>studentList2 = new ArrayList<Student>();
        studentList2.add(new Student("Scott", 104, 'A'));
        studentList2.add(new Student("Mary", 105, 'B'));
        studentList2.add(new Student("Kitty", 106, 'C'));

        List<List<Student>>studentList = Arrays.asList(studentList1,studentList2); //
        // Retrieve name of every students from student list | Extracting data from complex collection
        // before java8
        /*for(List<Student> s :studentList)
        {
            for (Student stu:s)
            {
                System.out.println(stu.sname); // Smith, ... Kitty

            }

        }*/

        // using streams/ flatMap()
        List<String> namesList = studentList.stream().
                flatMap(stulist -> stulist.stream().
                        map(s -> s.sname)).
                collect(Collectors.toList());
        System.out.println(namesList); // [Smith, John, Kenedy, Scott, Mary, Kitty]

                 /*  // Flat map is suitable when you have a complex data in the collection; it will cut the entire data into multiple pieces
        List<Integer> lst1 = Arrays.asList(1,2);
        List<Integer> lst2 = Arrays.asList(3,4);
        List<Integer> lst3 = Arrays.asList(5,6);
        //flat Map reads every collection into a function and add them to stream
        List<List<Integer>>finallist=Arrays.asList(lst1,lst2,lst3); // List<Integer since we are storing lst1,lst2,lst3
        List<Integer>finalresults = finallist.stream().flatMap(x ->x.stream().map(n -> n+10)).collect(Collectors.toList());
        System.out.println(finalresults); //  [11, 12, 13, 14, 15, 16]*/

    }
}
