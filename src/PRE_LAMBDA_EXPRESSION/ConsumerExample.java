package PRE_LAMBDA_EXPRESSION;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ConsumerExample {

    public static void convertToLowerCase(String s){  // method
        String result = s.toLowerCase();
        System.out.println(result);

    }




    public static void main(String[] args) {
        ConsumerExample.convertToLowerCase("TOHEEB");

        // CONSUMER EXAMPLE

        Consumer<String> convertToUpperCase = (str) -> System.out.println(str.toUpperCase());
        convertToUpperCase.accept("firstjob");

        Consumer<String> trimWords = (word) -> System.out.println(word.replace("t","T").trim());
        trimWords.accept("   trim this word     ");

        // SUPPLIER EXAMPLE
        Supplier<Double> squareOfNumber = () ->  Math.pow(2,3);
        Double sq = squareOfNumber.get();
        System.out.println(sq); // 8.0

        // PREDICATE EXAMPLE
        Predicate<Integer> isOdd = (numb) -> numb % 2 != 0 ;  //Odd
        System.out.println(isOdd.test(4)); // false
        System.out.println(isOdd.test(5)); // true

        // STREAM API
        List<String> list = Arrays.asList("rofia", "morenike", "aisha", "lola", "ade");
       // list.stream().map(name -> name.toUpperCase()).filter(name -> name.contains("A")).forEach(name -> System.out.println(name));
       List lis= list.stream().map(name -> name.toUpperCase()).filter(name -> name.contains("A")).collect(Collectors.toList());
        System.out.println(lis);



        List<Integer> numb = Arrays.asList(2,4,6,7,9);
        numb.stream().filter(number -> number % 2 == 0).map(number -> number * 100).forEach(number -> System.out.println(number));

        int sumNumb = numb.stream().filter(number -> number % 2 == 0).map(number -> number * 100).mapToInt(number -> number).sum();
        System.out.println(sumNumb); // 1200


    }

}
