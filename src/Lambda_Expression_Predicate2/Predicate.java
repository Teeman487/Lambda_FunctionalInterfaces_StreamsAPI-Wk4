package Lambda_Expression_Predicate2;
// Predicate is an interface which contains only one abstract method(Test abstract method). It will take a single parameter.
//Predicate interface  is a choice if you have conditional checks in you program
//Predicate  ---> one parameter returns boolean
//use only if you have conditional checks in your program...
public interface Predicate<T>
{
    public abstract boolean test(T t);

}
