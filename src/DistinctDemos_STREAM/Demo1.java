package DistinctDemos_STREAM;
// Non terminal/processing methods
//distinct()
// limit() : Non terminal operatio to processs object from the collection

//terminal
//count: terminal operation
// forEach()

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {
        List<String> vehiclesList= Arrays.asList("bus","car","bycle","bus","car","car","bike");

        // distinct
        /*List<String> distinctVehicles=vehiclesList.stream().distinct().collect(Collectors.toList()); // distinct(NonTerminal), collect(Terminal)
        System.out.println(distinctVehicles); */// [bus, car, bycle, bike]
        vehiclesList.stream().distinct().forEach(value-> System.out.println(value)); // bus car bycle bike] // forEach(Terminal operator)

        // count
       long count =vehiclesList.stream().distinct().count();
        System.out.println(count); // 4

        //limit(Non Terminal)
        List<String> limitedVehicleslist = vehiclesList.stream().limit(3).collect(Collectors.toList());
        System.out.println("Limited Vehicles:"+ limitedVehicleslist); // [bus, car, bycle]
        vehiclesList.stream().limit(3).forEach(val-> System.out.println(val)); // bus car bycle
    }
}
