package step.learning.oop;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Literature> funds;

    public Library() {
        funds = new ArrayList<>();
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