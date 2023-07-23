package Functions;

import java.util.function.Function;

public class Demo1 {

    public static void main(String[] args) {


        Function<Integer,Integer> f=n->n*n ;
                  //input or type of parameter, reading type
        System.out.println(f.apply(5)); //25
        System.out.println(f.apply(10)); //100
        System.out.println(f.apply(2));  // 4
        //String lenght
        // String --->lenght ---> Int
        Function <String, Integer> fn=s->s.length();
        System.out.println(fn.apply("Welcome")); // 7
        System.out.println(fn.apply("JavaProgramming")); // 16
    }
}
