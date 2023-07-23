package FIlterDemos_STREAM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Melisandre","Sansa","Jon","Daenerys","Joffery"); // filter the names based on some conditions
        List<String>longnames=new ArrayList<String>();
      //     Task: my collection based on condition: length name()>6 <8. filter
        longnames= names.stream().filter(str->str.length()>6 && str.length()<8).collect(Collectors.toList());//[]
        System.out.println(longnames); // [Joffery]
        //names.stream().filter(str->str.length()>6 && str.length()<8).forEach(str-> System.out.println(str));//for Each takes consumer// Joffery
        //names.stream().filter(str->str.length()>6 && str.length()<8).forEach(System.out::println); //Joffery
    }

}
