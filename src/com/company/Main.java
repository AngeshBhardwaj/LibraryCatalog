package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Book harry = new Book("Harry Potter","J K Rowling",650,67788);
        Map<String,Book> bookCollection = new HashMap<>();
        bookCollection.put("Harry Potter",harry);

        LibraryCatalogue lib = new LibraryCatalogue(bookCollection);
        lib.checkOutBook("Harry Potter");
        lib.nextDay();
        lib.nextDay();
        lib.checkOutBook("Harry Potter");
        lib.setDay(20);
        lib.returnBook("Harry Potter");
        lib.checkOutBook("Harry Potter");
    }
}
