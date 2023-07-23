package Lambda_Expression_Functional_Interface;

@FunctionalInterface  // Its optional but for explicity // Lambda Expressions are always asscociated with Functional Interface
// Functional interface(allows one abstract method) only allows Lambda Expression; but other type of interfaces dont allow
interface Cab // Cab (Function interface) contains only one abstract method
{
    public void  bookCab();
}

//class  Ola implements Cab
//{
//    /**public  void  bookCab(){  // public(Access Modifier) void(return type but only allow sout) bookCab(name of the method)
//        System.out.println("Ola cab is bookes...");
//    }**/
//
//    //()-> System.out.println("Ola cab is bookes..."); // Lambda expression instead of above
//
//} // These codes are unncessary when using Lambda Expression

public class Test {
    public static void main(String[] args) {
        //Instantiating
      //  Ola cab = new Ola();
      //  Cab cab = new Ola(); // Interface(or Parent class) varName = new classImplementedInterface();
         //  cab.bookCab();   // Ola cab is bookes...

//               Instantiating using Lambda Expression
          Cab cab =()-> System.out.println("Ola cab is bookes...");
        cab.bookCab(); // ()-> System.out.println("Ola cab is bookes...") also called bookCab()

    }
}
