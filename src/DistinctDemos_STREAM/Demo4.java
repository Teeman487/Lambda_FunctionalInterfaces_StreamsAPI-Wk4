package DistinctDemos_STREAM;

import java.util.Arrays;
import java.util.List;

public class Demo4 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("A","B","C","1","2","3");

        Object arr[]=stringList.stream().toArray();
       // System.out.println(arr); // we cannot directly the element in Array,it is not a collection
       // System.out.println(arr);
        System.out.println(arr.length); // 6

        for (Object v:arr)
        {
            System.out.println(v); //A B C 1 2 3
        }
    }
}
