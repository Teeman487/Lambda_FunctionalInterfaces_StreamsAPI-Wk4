package DistinctDemos_STREAM;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo2 {
    public static void main(String[] args) {
        List<Integer>numbersList= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        //how many evenNumbers in the List| Conditional
       // count
        long numberOfevenNumbers = numbersList.stream().filter(num ->num%2==0).count();
        System.out.println(numberOfevenNumbers); // 5 // 10

        // min() --Non Terminal
        Optional <Integer> min =numbersList.stream().min((val1, val2) ->{return val1.compareTo(val2);});
        System.out.println(min.get());  // 1

        // max
        Optional <Integer> max =numbersList.stream().max((val1, val2) ->{
            return val1.compareTo(val2);
        });
        System.out.println(max.get()); // 10
    }
}
