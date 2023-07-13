package step.learning.oop;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Literature> funds;

    public Library() {
        funds = new ArrayList<>();
        funds.add(new Book("Art of Computer Programming", "Donald Knuth"));
        funds.add(new Book("The C Programming Language", "Dennis Ritchie"));
        funds.add(new Book("The C++ Programming Language", "Bjarne Stroustrup"));
        funds.add(new Booklet("Java", "Oracle"));
        funds.add(new Journal("Java Magazine", 1));
        funds.add(new Newspaper("The New York Times", new java.util.Date()));
    }

    public void showCatalog() {
        for (Literature fund : funds) {
            System.out.println();
            System.out.println(fund.getTitle());
            if(fund instanceof Book) {
                System.out.println("Author: " + ((Book) fund).getAuthor());
            } else if (fund instanceof Booklet) {
                System.out.println("Publisher: " + ((Booklet) fund).getPublisher());
            } else if (fund instanceof Journal) {
                System.out.println("Number: " + ((Journal) fund).getNumber());
            } else if (fund instanceof Newspaper) {
                System.out.println("Date: " + ((Newspaper) fund).getDate());
            }
        }
    }
}

/*
Project Library
Library - books, magazines, newspapers, etc.
 */