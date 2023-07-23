package MapDemos_STREAM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Map concept to proocess the collection
// Map reads each element in collection and then applies operation on each and store them in another collection
// Map processes data from the collection by applying certain operation on every element on the collection
public class MapDemo1 {
    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("bus","car","bicycle","flight","train");
        List<String> vehiclesListinUpperCase=new ArrayList<String>();
         //before java8/ without using streams
        /*for (String name:vehicles)
        {
            vehiclesListinUpperCase.add(name.toUpperCase());
        }
        System.out.println(vehiclesListinUpperCase);*/  // [BUS, CAR, BICYCLE, FLIGHT, TRAIN]
        // stream - map
        /* vehiclesListinUpperCase=vehicles.stream().map(name ->name.toUpperCase()).collect(Collectors.toList());// map accepts a function
        System.out.println(vehiclesListinUpperCase);*/  // [BUS, CAR, BICYCLE, FLIGHT, TRAIN]
        //vehicles.stream().map(name ->name.toUpperCase()).forEach(n -> System.out.println(n)); // forEach is a consumer concept
        vehicles.stream().map(name ->name.toUpperCase()).forEach(System.out::println);
    }


}
