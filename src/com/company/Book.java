package com.company;

public class Book {
    //Properties
    String title;
    String author;
    int pageCount;
    int ISBN;
    boolean isCheckedOut;
    int dayCheckedOut = -1;

    //Constructors
    public Book(String bookTitle, String bookAuthor){
        this.title = bookTitle;
        this.author = bookAuthor;
        this.pageCount = -1;
        this.ISBN = -1;
        this.isCheckedOut = false;
    }

    public Book(String bookTitle, int pageCount, int ISBN){
        this.title = bookTitle;
        this.author = "";
        this.pageCount = pageCount;
        this.ISBN = ISBN;
        this.isCheckedOut = false;
    }

    public Book(String bookTitle, String bookAuthor, int pageCount, int ISBN){
        this.title = bookTitle;
        this.author = bookAuthor;
        this.pageCount = pageCount;
        this.ISBN = ISBN;
        this.isCheckedOut = false;
    }

    //Getters
    public String getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPageCount() {
        return this.pageCount;
    }

    public int getISBN() {
        return this.ISBN;
    }

    public boolean getIsCheckedOut() {
        return this.isCheckedOut;
    }

    public int getDayCheckedOut() {
        return this.dayCheckedOut;
    }

    //Setters
    public void setAuthor(String bookAuthor){
        this.author = bookAuthor;
    }

    public void setCheckedOut(boolean checkedOut, int dayCheckedOut) {
        this.isCheckedOut = checkedOut;
        setDayCheckedOut(dayCheckedOut);
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    private void setDayCheckedOut(int dayCheckedOut){
        this.dayCheckedOut = dayCheckedOut;
    }
}
