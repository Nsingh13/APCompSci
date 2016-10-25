package Assignment06;

/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Book
{
    private String title;
    private boolean rented;

    // Pre: none
    // Post: A new Book is created with given bookTitle
    public Book(String bookTitle)
    {
        title = bookTitle;
    }

    // Pre: none
    // Post: this Book is marked as rented.
    public void rented()
    {
        rented = true;
    	
    }

    // Pre: none
    // Post: this Book is marked as not rented.
    public void returned()
    {
    	 rented = false;
    }

    // Pre: none
    // Post: returns true if the book is rented, false otherwise
    public boolean isBorrowed()
    {
       return rented;
    } 

    // Pre: none
    // Post: returns the title of the book
    public String getTitle()
    {
        // Implement this method
    	return title;
    }

    // Pre: none
    // Post: returns the name of the book
    @Override
    public String toString()
    {
        return "Book: " + getTitle();
    }
}