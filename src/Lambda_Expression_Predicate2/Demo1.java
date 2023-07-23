package Lambda_Expression_Predicate2;

import java.util.function.Predicate;

// Predicate is an interface which contains only one abstract method(Test abstract method). It will take a single parameter.
//Predicate interface  is a chiice if you have conditional checks in you program
//Predicate  ---> one parameter returns boolean
//use only if you have conditional checks in your program...
public class Demo1 {
    public static void main(String[] args) {
        //Ex1
       Predicate<Integer> p=i ->(i>10);  //  Predicate<Integer>(Predicate interface) p(reference variable) i(arg)
        System.out.println(p.test(20)); // true // invoking labda expr(->(i>10)) by calling the test method (p.test(20))
        System.out.println(p.test(5)); // false

        //Ex2: Check the length of given string is greater than 4 or not.
        Predicate<String> pr= s ->(s.length()>4);
//        System.out.println(pr.test("welcome")); // true
//        System.out.println(pr.test("xyz")); // false

        //Ex3: Print array elements whose size is > 4 from array
        String names[]= {"David","Scott","Smith","John","Mary"};

        //Reading elements into name
        for (String name: names) // used to print for multiple elements
        {
            if(pr.test(name))// using lambda exp to verify the length of names > 4
            {
                System.out.println(name); // true false true false David Scott Smith
            }

            /*if(name.length()>4)// 10 cond
            {
                System.out.println(name); // true false true false David Scott Smith

            }*/



        }
    }
}
