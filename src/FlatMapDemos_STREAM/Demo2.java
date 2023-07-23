package FlatMapDemos_STREAM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        List<String> teamA = Arrays.asList("Scott","David", "John");
        List<String> teamB = Arrays.asList("Mary","Luna", "Tom");
        List<String> teamC = Arrays.asList("Ken","Jony", "Kitty");

        //FlatMap
        List<List<String>>playersInWorldCup = new ArrayList<List<String>>();
        playersInWorldCup.add(teamA);
        playersInWorldCup.add(teamB);
        playersInWorldCup.add(teamC);
//        List<List<String>>playersInWorldCup = Arrays.asList(teamA,teamB,teamC);
       //Big collection Before Java8\
        for(List<String> team:playersInWorldCup) //reading first collection elements into team //

        {
            //System.out.println(team);  //[Scott, David, John] [Mary, Luna, Tom] [Ken, Jony, Kitty]
            for (String name:team) // from team collection; extract the values from team collection in String form

            {
                System.out.println(name);  // Scott ,...,kitty
            }

        }
        //using Streams flatMap()
            /*List<String> names=playersInWorldCup.stream().flatMap(pList ->pList.stream()).collect(Collectors.toList());
        System.out.println(names);  // [Scott, David, John, Mary, Luna, Tom, Ken, Jony, Kitty]*/

      /*  // Flat map is suitable when you have a complex data in the collection; it will cut the entire data into multiple pieces
        List<Integer> lst1 = Arrays.asList(1,2);
        List<Integer> lst2 = Arrays.asList(3,4);
        List<Integer> lst3 = Arrays.asList(5,6);
        //flat Map reads every collection into a function and add them to stream
        List<List<Integer>>finallist=Arrays.asList(lst1,lst2,lst3); // List<Integer since we are storing lst1,lst2,lst3
        List<Integer>finalresults = finallist.stream().flatMap(x ->x.stream().map(n -> n+10)).collect(Collectors.toList());
        System.out.println(finalresults); //  [11, 12, 13, 14, 15, 16]*/


    }
}
