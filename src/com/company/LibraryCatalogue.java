package com.company;

import java.util.HashMap;
import java.util.Map;

public class LibraryCatalogue {
    //Properties
    Map<String,Book> bookCollection = new HashMap<>();
    int currentDay = 0;
    int lengthOfCheckout = 7;
    double initLateFee = 50.00;
    double addDailyLateFee = 10.00;

    //Constructors
    public LibraryCatalogue(Map<String,Book> bookCollection){
        this.bookCollection = bookCollection;
    }

    public LibraryCatalogue(Map<String,Book> bookCollection, int lengthOfCheckout,
                                 double initLateFee, double additionalDailyLateFee){
        this.bookCollection = bookCollection;
        this.lengthOfCheckout = lengthOfCheckout;
        this.initLateFee = initLateFee;
        this.addDailyLateFee = additionalDailyLateFee;
    }

    //Getters
    public int getCurrentDay() {
        return this.currentDay;
    }

    public Map<String,Book> getBookCollection(){
        return this.bookCollection;
    }

    public Book getBook(String bookTitle){
        return getBookCollection().get(bookTitle);
    }

    public int getLengthOfCheckout() {
        return this.lengthOfCheckout;
    }

    public double getAddDailyLateFee() {
        return this.addDailyLateFee;
    }

    public double getInitLateFee() {
        return this.initLateFee;
    }

    //Setters
    public void nextDay(){
        currentDay++;
    }

    public void setDay(int day){
        currentDay = day;
    }

    //Instance Methods
    public void checkOutBook(String bookTitle){
        Book book = getBook(bookTitle);
        if(book.getIsCheckedOut() ){
            bookAlreadyinUse(book);
            //System.out.println("We are sorry. '"+ bookTitle + "' book is already checked-out.");
        }
        else{
            book.setCheckedOut(true,getCurrentDay());
            System.out.println("You just checked out '" + bookTitle + "' book. It is due on day "+
                    (getCurrentDay() + getLengthOfCheckout()) + ".");
        }
    }

    public void returnBook(String bookTitle){
        Book book = getBook(bookTitle);
        int daysLate = getCurrentDay() - (book.getDayCheckedOut()+getLengthOfCheckout());
        if(daysLate > 0){
            System.out.println("You are late. You owe the library Rs." + (getInitLateFee() +
                    (getAddDailyLateFee()*daysLate)) + " because your are " + daysLate + " days overdue.");
        }
        else{
            System.out.println("Book returned, thank you.");
        }
        book.setCheckedOut(false,-1);
    }

    public void bookAlreadyinUse(Book book){
        System.out.println("The book " + book.getTitle() + " is out of library. It is supposed to be back here by day "
         + (book.getDayCheckedOut() + getLengthOfCheckout()) + ".");
    }
}
