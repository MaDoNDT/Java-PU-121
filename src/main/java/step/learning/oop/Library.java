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
    }

    public void showCatalog() {
        for (Literature fund : funds) {
            System.out.println(fund.getTitle());
        }
    }
}

/*
Project Library
Library - books, magazines, newspapers, etc.
 */