package chamrattt.java.collection;

import java.awt.print.Book;
import java.util.HashSet;

public class BookHashSetExample {
    int id;
    String name,author,publisher;
    int quantity;

    public BookHashSetExample(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    public static void main(String[] args) {
        HashSet<BookHashSetExample> set = new HashSet<BookHashSetExample>();

        BookHashSetExample b1 = new BookHashSetExample(101,"Java8 Programming","Sreng Vichet","NUM",2);
        set.add(b1);
        for (BookHashSetExample b : set){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }

    }
}
