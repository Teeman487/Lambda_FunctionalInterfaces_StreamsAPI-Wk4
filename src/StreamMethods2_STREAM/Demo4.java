package StreamMethods2_STREAM;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//  concat
public class Demo4 {
    public static void main(String[] args) {
        List<String> animalsList = Arrays.asList("Dog","Cat","Elephant");
        List<String> birdsList = Arrays.asList("peackock","parrot","Crow");  // 2 collections created

        Stream<String> stream1 = animalsList.stream();
        Stream<String> stream2 = birdsList.stream(); // Add them to 2 diff stream

        List<String> finallist = Stream.concat(stream1,stream2).collect(Collectors.toList()); // then concat them into a list

        for (String item:finallist)
        {
            System.out.println(item);  // Dog Cat .... Crow

        }
    }
}
