package TASK_GenericForm;

public class Person1<T1,T2,T3> implements Comparable<Person1> { // this Comparable(interface) is inbuilt in system
    T1 name; // variables or attributes of Teacher, Seniorstudent and Juniorstudent
    T2 level;
    T3 age;


    // Constructor
    public Person1(T1 name, T2 level, T3 age) {
        this.name = name;
        this.level = level;
        this.age = age;

    }
    public T1 getName() {
        return name;
    }

    public T2 getLevel() {
        return level;
    }
    public T3 getAge() {
        return age;
    }

    @Override
    public int compareTo(Person1 other) {  // Method overriden from Comparable inbuilt
        return Integer.compare((Integer) age, (Integer) level);  // inbuilt comparable to class Person
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", age=" + age +
                '}';
    }
    //    public StatusType getDesignation() {
//        return designation;
   // }
}

/*                      Book Selection - Person requesting for Book
* 1) Person requesting for Book
* i. Create a Person class: We intend to create a Priority Queue for Teacher, Senior Students and Junior Students
* ii. Person implements Comparable<Person>: // this Comparable(interface) is inbuilt in system: We intend to compare
*     Teacher, Senior Student and Junior Students on a (first come first serve - Priority Queue)
*      basis in an (inbuilt Comparable)
*
*
* Generics: enable types (classes and interfaces) to be parameters when defining:
  classes, interfaces and methods.
  a benefit is to eliminate the need to create multiple version
  of methods or classes for various datatypes.
  use 1 version for all reference data types.
*
*
*
*
*
* */
