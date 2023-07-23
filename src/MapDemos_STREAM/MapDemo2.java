package MapDemos_STREAM;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo2 {
    public static void main(String[] args) {

        List<String> vehicles = Arrays.asList("bus","car","bicycle","flight","train");

        //before java8/without using streams
       /* for(String name:vehicles)
        {
            System.out.println(name.length()); // 3 3 7 6 5
        }*/

        //using streams
       //vehicles.stream().map(vname->vname.length()).forEach(len-> System.out.println(len)); // 3 3 7 6 5
       // vehicles.stream().map(vname->vname.length()).forEach(System.out::println); // 3 3 7 6 5

        List<Integer> veh = vehicles.stream().map(vname->vname.length()).collect(Collectors.toList());
        System.out.println(veh);  // [3, 3, 7, 6, 5]
    }

}
