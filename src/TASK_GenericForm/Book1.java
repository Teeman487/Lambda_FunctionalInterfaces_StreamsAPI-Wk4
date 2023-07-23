package TASK_GenericForm;

public class Book1 <T1,T2,T3,T4> {
    // Attributes or Variables
    T1 Author;
    T2 Title;
    T3 year;
    T4 quantity;

    // Constructor
    public Book1(T1 author, T2 title, T3 year, T4 quantity) {
        Author = author;
        Title = title;
        this.year = year;
        this.quantity = quantity;
    }

    public T1 getAuthor() {
        return Author;
    }

    public T2 getTitle() {
        return Title;
    }

    public T3 getYear() {
        return year;
    }

    public T4 getQuantity() {
        return quantity;
    }
}
/*                      Book Selection
 * 1) Book selection and replacement in Library:
 * i. Create a Book class with properties and behaviors
 * ii. The library should return ‘book taken: Create Array list of Books to be added or stored in Library
 * iii. They can be multiple copies of the same book in the library: after storage, Librarian uses Comparator features
 *      to Order the books multiple times in the library .
 *
 */
