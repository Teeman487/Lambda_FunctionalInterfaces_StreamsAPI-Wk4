package StreamMethods2_STREAM;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {
        //Sorted
        List<Integer> list1 = Arrays.asList(2,4,1,3,7,5,9);
    List<Integer> sortedList=list1.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList); // [1, 2, 3, 4, 5, 7, 9]

        List<Integer> reversesortedList=list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reversesortedList); // [9, 7, 5, 4, 3, 2, 1]
        // Strings
        List<String> list2 = Arrays.asList("John","Mary","Kim","David","Smith");
        List<String>sortedlist2 = list2.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedlist2); // [David, John, Kim, Mary, Smith]

        List<String>reversesortedlist2 = list2.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reversesortedlist2); // [Smith, Mary, Kim, John, David]

    }
}
