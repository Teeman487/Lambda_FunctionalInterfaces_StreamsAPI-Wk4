package Lambda_Expression_Predicate2;

import java.util.function.Predicate;
//Predicate is a predefined function interface
//Joining Predicates - and, or , negate
// p1   -- checks number is even
// p2    -- checks greatre than 50
public class Demo3 {
    public static void main(String[] args) {

        int a[] = {5,15,20,25,30,35,40,45,50,55,60,65};
        Predicate<Integer> p1= i ->i%2==0; // i must be Even
        Predicate<Integer> p2=i ->i>50;

        //and
        System.out.println("Following are numbers EVEN & Greater than 50....");
       /* for (int n:a)
        {
         if(p1.and(p2).test(n)) //    if(p1.test(n) && p2.test(n))
            {
                System.out.println(n); // 60
            }
        }*/

        //or

        for (int n:a)
        {
            /*if(p1.or(p2).test(n))    //if(p1.test(n) || p2.test(n))
            {
                System.out.println(n); // 20 30 40 50 55 60 65
            } *///    5,15,25,35,,45,,, are not printed

            //negate
           /* if(p1.negate().test(n)) // opposite result
            {
                System.out.println(n);
            }*/
            if(p2.negate().test(n)) //if(p1.or(p2).test(n))
            {
                System.out.println(n);
            }
        }

    }
}
