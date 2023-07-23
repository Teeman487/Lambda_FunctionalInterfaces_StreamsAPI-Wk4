package FIlterDemos_STREAM;

import java.util.Arrays;
import java.util.List;

public class FilterDemo3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("cup",null,"forest","sky","book","null","theatre");
       /* List<String>result= words.stream().filter(w->w!=null).collect(Collectors.toList());
        System.out.println(result);*/ // [cup, forest, sky, book, null, theatre]
        //words.stream().filter(w->w!=null).forEach(w-> System.out.println(w));
    }
}
