package FlatMapDemos_STREAM;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {
        //map()
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);

       List<Integer> list2 = list1.stream().map(n ->n+10).collect(Collectors.toList());
        System.out.println(list2); // [11, 12, 13, 14, 15, 16]

        // Flat map is suitable when you have a complex data in the collection; it will cut the entire data into multiple pieces
        List<Integer> lst1 = Arrays.asList(1,2);
        List<Integer> lst2 = Arrays.asList(3,4);
        List<Integer> lst3 = Arrays.asList(5,6);

        //flat Map reads every collection into a function and add them to stream
        List<List<Integer>>finallist=Arrays.asList(lst1,lst2,lst3); // List<Integer since we are storing lst1,lst2,lst3
       List<Integer>finalresults = finallist.stream().flatMap(x ->x.stream().map(n -> n+10)).collect(Collectors.toList());
        System.out.println(finalresults); //  [11, 12, 13, 14, 15, 16]

    }
}
