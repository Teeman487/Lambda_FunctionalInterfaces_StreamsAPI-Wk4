package TASK_GenericForm;

public class PriorityQueue1 {
    public static void main(String[] args) {
        // Instantiate
        Person1 <String,Integer,Integer>teacher = new Person1<>("Teacher",10,30); // insertion order preserved  // First in
        Person1 <String,Integer,Integer>seniorStudent= new Person1<>("Senior Student",2,20);// insertion order preserved  // Second in
        Person1 <String,Integer,Integer> juniorStudent = new Person1<>("Junior Student",1,15);// insertion order preserved // Last in

    // Task1: placing Person[teacher,seniorStudent,juniorStudent] in a Priority Queue
        java.util.PriorityQueue<Person1> queue = new java.util.PriorityQueue<>();

        queue.add(teacher);
        queue.add(seniorStudent);
        queue.add(juniorStudent);

     //  Task2a: After adding teacher, seniorStudent and juniorStudent to PriorityQueue..........
     //  (level,other.level|age) = level<age Last,First,Second [insertion order process]
        //System.out.println(queue); //[Person{name='Junior Student', level=1, age=15}, Person{name='Teacher', level=10, age=30}, Person{name='Senior Student', level=2, age=20}]

    //  Task2b: After adding teacher, seniorStudent and juniorStudent to PriorityQueue..........
    //  (level,level) = level<age (First Come First Serve Basis) [insertion order process]
       // System.out.println(queue); // [Person{name='Teacher', level=10, age=30}, Person{name='Senior Student', level=2, age=20}, Person{name='Junior Student', level=1, age=15}]

    //  Task2c: After adding teacher, seniorStudent and juniorStudent to PriorityQueue..........
    //  (age,level) = age>level consideing agePriority over level (First Come First Serve Basis)
         //System.out.println(queue);//[Person{name='Teacher', level=10, age=30}, Person{name='Senior Student', level=2, age=20}, Person{name='Junior Student', level=1, age=15}]

    // Task3: remove() or poll(): Returns first element(teacher) and Removes other elements
    // (seniorStudent or juniorStudent) from PriorityQueue inorder to achieve (first come first serve basis).
      //  System.out.println(queue.poll());//Person{name='Teacher', level=10, age=30} first come first serve basis

    // Task4a:                          Advanced for loop
        for(int i=0; i<3; i++)// looping first coe first serve basis 3 times
        { //(age,level) = age>level considering agePriority over level (First Come First Serve Basis)
           // System.out.println(queue.poll()); //Person{name='Teacher', level=10, age=30}
                                              //Person{name='Senior Student', level=2, age=20}
                                             //Person{name='Junior Student', level=1, age=15}
            Person1 person =queue.poll();

            System.out.println("Person rank:"+ person.getName()+"," + person.getAge()); //The books are given by the Librarian
        }

    // Task4b:  Enhanced For loop suitable for First Come First serve Basis (Order of Constructors) - No Priority Queue
        /*for (Person e:queue)
        {
            //System.out.println(e);      //Person{name='Teacher', level=10, age=30}
                                       // Person{name='Senior Student', level=2, age=20}
                                      // Person{name='Junior Student', level=1, age=15}
            System.out.println("Person rank: " + e.getName() +" , " + e.getAge());
        }*/


        /*while (!queue.isEmpty()) { // while will loop or allow multiple results
           //Person result = queue.poll(); //  poll() or remove() returns & removes first element from queue
           //System.out.println("Person rank: " + result.getName() +" , " + result.getAge());
        }*/
    }
}
