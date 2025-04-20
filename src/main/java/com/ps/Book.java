package com.ps;

public class Book {
    private int bookId;
    private String bookIsbn;
    private String bookTitle;
    private boolean isCheckedOut;
    private String checkedOutTo;

public boolean isCheckedOut() {
    return isCheckedOut;
}
public String getCheckedOutTo(){
    return checkedOutTo;
}

    public Book(int bookId, String bookIsbn, String bookTitle) {

        this.bookId = bookId;
        this.bookIsbn = bookIsbn;
        this.bookTitle = bookTitle;
        this.isCheckedOut = false;
        this.checkedOutTo = " ";
    }

    public void checkout(String name) {
        if (!isCheckedOut) {
            isCheckedOut = true;
            checkedOutTo = name;
            System.out.println(bookTitle + "has been checked out to " + name + ".");
        } else {
            System.out.println(bookTitle + "is already checked out.");

        }
    }
    public void checkedIn() {
        if (isCheckedOut) {
            isCheckedOut = false;
            System.out.println(bookTitle + " has been returned by " + checkedOutTo + ".");
            checkedOutTo = " ";
        } else {
            System.out.println(bookTitle + "is not checked out.");
        }

        }

    }







