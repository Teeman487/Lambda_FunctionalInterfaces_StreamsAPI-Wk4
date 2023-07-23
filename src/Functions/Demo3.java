package Functions;

/*Function chaining

andThen()
compose()*/


import java.util.function.Function;

public class Demo3 {
    public static void main(String[] args) {

        Function<Integer,Integer> f1=n->n*3; // 2*2 =4      //3*2= 6
        Function<Integer,Integer> f2=n->n*n*n; // 4*4*4=64  //6*6*6 = 216  // 36

        System.out.println(f1.andThen(f2).apply(2)); //
        //System.out.println(f2.compose(f1).apply(3)); // 2*2*2=8 ;8*2   // 3*3*3=27 ;27*2
    }


}
