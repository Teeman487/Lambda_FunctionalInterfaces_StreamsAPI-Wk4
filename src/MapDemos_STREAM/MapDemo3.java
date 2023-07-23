package MapDemos_STREAM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapDemo3 {
    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(2,3,4,5);
        List<Integer> multipliedList = new ArrayList<Integer>();
        //Before8
        /*for(int num:numbersList)
        {
           // System.out.println(num*3); // 6 9 12 15
            multipliedList.add(num*3);
        }
        System.out.println(multipliedList); */// [6, 9, 12, 15]

        //Using streams-map
        /*multipliedList=numbersList.stream().map(num->num*3).collect(Collectors.toList());
        System.out.println(multipliedList);*/ // [6, 9, 12, 15]
        //or
        //numbersList.stream().map(num->num*3).forEach(num ->System.out.println(num)); // 6 9 12 15
        numbersList.stream().map(num->num*3).forEach(System.out::println);  //
    }
}
