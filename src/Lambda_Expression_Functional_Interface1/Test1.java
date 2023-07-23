package Lambda_Expression_Functional_Interface1;

interface Cab1
{
  //  public void bookCab(String source, String destination);
    public String bookCab(String source, String destination);

}
/*class  Ola implements Cab1
{
    @Override
    public String bookCab(String source, String destination) {
        System.out.println("Ola cab is booked from " + source + "To" + destination);
        return ("Price: 500 Rs");
    }
}*/

/*class  Ola implements Cab1
{
    @Override
    public void bookCab(String source, String destination) {

        System.out.println("Ola cab is booked from " + source + "To" + destination);

    }
}*/

public class Test1 {
    public static void main(String[] args) {
        //Cab cab = new Ola();
        //cab.bookCab("Hyd", "Mumbai");
        //Cab cab = (String source, String destination) -> System.out.println("Ola cab is booked from " + source + "To" + destination);
//        Cab cab = (source,  destination) -> System.out.println("Ola cab is booked from " + source + "To" + destination);
//        cab.bookCab("Hyd","Mumbai");

//              Cab cab = new Ola();
//        System.out.println( cab.bookCab("Hyd", "Mumbai")); // Ola cab is booked from Hyd ToMumba // Price: 500 Rs
       /* Cab cab = (String source, String destination) -> {
       System.out.println("Ola cab is booked from " + source + "To" + destination);
            return ("Price: 500 Rs");
        }; // the curly bracket is used bcus of 2 different return type(sout & return)
*/
        Cab1 cab = (source, destination) ->{System.out.println("Ola cab is booked from " + source + "To" + destination);
            return ("Price: 500 Rs");
        };
        System.out.println( cab.bookCab("Hyd", "Mumbai")); // the curly bracket is used bcus of 2 different return type(sout & return)

    }
}
