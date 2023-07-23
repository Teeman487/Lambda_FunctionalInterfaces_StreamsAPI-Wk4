package FIlterDemos_STREAM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Collection: to represent group of data/objects as single entity
//Stream: to process the data from collection we use streams concepts
// Filter method: filtering the data based on certain conditions
public class FilterDemo1 {
    public static void main(String[] args) {
        // Create or declaring list of collections
       /* ArrayList<Integer> numbersList = new ArrayList<Integer>();  // ArrayList of numbers // [10, 15, 20, 25, 30]
        numbersList.add(10);                  // adding elements
        numbersList.add(15);
        numbersList.add(20);
        numbersList.add(25);*/

        // This is preferrable
        List<Integer> numbersList= Arrays.asList(10,15,20,25,30); // numberList is a collction which contains nos of values (10,15,20,25,30)// [10, 15, 20, 25, 30]
        // Now my requirement is i want to filter this data((10,15,20,25,30) based on certain conditions
        // I want to filter only EvenNumbers from (10,15,20,25,30) and put the nos into other collections below
        List<Integer>evenNumbersList= new ArrayList<Integer>(); //  collection2 for filtering//put the evenNumber here

        //without using streams
     /*   for (int n:numbersList)  // Reading elements into variable n

        {
            if(n%2==0) // if n is EVEN // 10,20,30
                evenNumbersList.add(n); // [10, 15, 20, 25, 30]

        }
        System.out.println(evenNumbersList);*/ // [10, 20, 30]

        //with streams
       /* evenNumbersList=numbersList.stream().filter(n ->n%2==0).collect(Collectors.toList()); //
        //Store_in_one_variable=Collection add to stream,(2)To process the data into Stream: filter method(Condition ver:takes predicate as a parameter),(3) collect(collects the filter data) Collectors.toList()-put or add the data here
        System.out.println(evenNumbersList);// [10, 20, 30]
        */
        numbersList.stream().filter(n ->n%2==0).forEach(n-> System.out.println(n));//forEach(n-> System.out.println(n)) is a consumer // 10 20 30 ,
        //Store_in_one_variable=Collection add to stream,(2)To process the data into Stream: filter method(Condition ver:takes predicate as a parameter),(3) get each individual value

        // numbersList.stream().filter(n ->n%2==0).forEach(System.out::println); // 10 20 30
    }
}
