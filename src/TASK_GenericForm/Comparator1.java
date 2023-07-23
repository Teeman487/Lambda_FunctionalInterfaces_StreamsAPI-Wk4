package TASK_GenericForm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparator1 { // Created Comparator
    public static void main(String[] args) {

        Book1 <String,String,Integer,Integer> maths = new Book1<>("Mr Warith","GeneralMaths",2023,1);
        Book1 <String,String,Integer,Integer> english = new Book1 <> ("Mr Kozeem","Active English",2022,0);
        Book1 <String,String,Integer,Integer> physics = new Book1 <> ("Mr Tunde","New Physics",2018,3);
        Book1 <String,String,Integer,Integer> agric = new Book1 <> ("Mr Alaba","agric Farm Tool",1989,4);
        Book1 <String,String,Integer,Integer> chemistry = new Book1 <> ("Mr Jide","Organic Chemistry",2023,5);

    // The library should return ‘book taken: Create Array list of Books to be added or stored in Library.
        List<Book1> books = new ArrayList<>();
        books.add(maths);
        books.add(english);
        books.add(physics);
        books.add(agric);
        books.add(chemistry);

    // They can be multiple copies of the same book in the library: after storage, Librarian uses Comparator features to
    // sort or Order the books multiple times in the library.
        Collections.sort(books, new java.util.Comparator<Book1>() {

            @Override
            public int compare(Book1 book1, Book1 book2) {
                return Integer.compare((Integer) book1.getQuantity(), (Integer) book2.getQuantity()); // ascending oder based on Quantity...

            }
        }
        );
        for (Book1 book : books) {
            System.out.println("There are " + book.getQuantity() + " pieces of " + book.getTitle()+" returned");
        }
        /*
        *  There are 0 pieces of Active English
           There are 1 pieces of GeneralMaths
           There are 3 pieces of New Physics
           There are 4 pieces of agric Farm Tool
           There are 5 pieces of Organic Chemistry*/





    }
}
