package step.learning.oop;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Literature> funds;

    public Library() {
        funds = new ArrayList<>();
        funds.add(new Book("Art of Computer Programming", "Donald Knuth"));
        funds.add(new Book("The C Programming Language", "Dennis Ritchie"));
        funds.add(new Book("The C++ Programming Language", "Bjarne Stroustrup"));
        funds.add(new Booklet("Java", "Oracle"));
        funds.add(new Journal("Java Magazine", 1));
        funds.add(new Newspaper("The New York Times", new java.util.Date()));
    }

    /*public void showCatalog() {
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
    }*/

    public void showCatalog(){
        System.out.println("Library catalog:");
        for(Literature fund : funds) {
            System.out.println();
            System.out.println( fund.getCard() );
        }
        System.out.println();
        showCopyableCatalog();
        System.out.println();
        showNonCopyableCatalog();
        System.out.println();
        showPeriodic();
        System.out.println();
        showBooksAuthors();
    }

    public void showCopyableCatalog(){
        System.out.println("<---Copyable catalog--->");
        for(Literature fund : funds) {
            if(fund instanceof Copyable) {
                System.out.println( fund.getCard() );
            }
        }
    }

    public void showNonCopyableCatalog(){
        System.out.println("<---Non-copyable catalog--->");
        for(Literature fund : funds) {
            if(!(fund instanceof Copyable)) {
                System.out.println( fund.getCard() );
            }
        }
    }

    public void showPeriodic(){
        System.out.println("<---Periodicals--->");
        for(Literature fund : funds) {
            if(fund instanceof Periodic) {
                System.out.print( fund.getCard() );
                System.out.printf(" Period: %s.%n", ((Periodic) fund).getPeriod());
            }
        }
    }

    public void showBooksAuthors(){
        System.out.println("<---Books Authors--->");
        for(Literature fund : funds) {
            if(fund instanceof Book) {
                //System.out.println( ((Book) fund).getAuthor() );
                Book book = (Book) fund;
                System.out.println( book.getAuthor() );
            }
        }
    }
}

/*
Project Library
Library - books, journals, newspapers, etc.

Extend the project with the following:
Copy:
Books, journals, booklets - can be copied.
Newspapers - cannot be copied.
Periodicals:
Journals, newspapers - are periodicals.
Books, booklets - are not periodicals.
Periodicals can be issued for a certain period of time(String - daily, weekly, monthly, etc.).
 */

/*
Hologram - !!!! - 3D image :
name, date of creation.
Експановані (для виставки), але не для читання
Т.З. створити інтерфейс Expo
Створити клас Hologram, який реалізує інтерфейс Expo, а також все що треба для Літератури
Додати до бібліотеки декілька голограм
Створити методи для селекціі експанованих та не експанованих фондів.
** Створити клас Постер який є експанованим та копійованим
 */