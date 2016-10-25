package Assignment06;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class Library here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Library
{
    // Instance variables
    private String address;
    private String time;
    private final double FINE = 0.25;
    private List<Book> catalog = new ArrayList<>();

    // Pre: none
    // Post: creates a library with the given libAddress
    public Library(String libAddress)
    {
        // Implement this constructor
    	address = libAddress;
    	
    }

    // Pre: none
    // Post: book is added to the catalog
    public void addBook(Book book)
    {
        catalog.add(book);
        
    }

    // Pre: none
    // Post: the library's address is printed to the console.
    public void printAddress()
    {
        // Implement this method
    	System.out.println(address);
    }
    public void printBooks()
    {
    	 for(int i = 0; i < catalog.size(); i++){
    		 if(catalog.get(i).isBorrowed()){
    			 System.out.println(catalog.get(i) + " is already rented from "
                         + toString());
    		 }
    		 else{
    			// System.out.println(catalog.get(i));
    			 System.out.println(catalog.get(i));
    		 }
    		 
    	 }
    		 
    }

    // Pre: none
    // Post: prints to console whether book is already rented, if it is not
    //          in the catalog, or if it has been rented successfully.
    public void borrowBook(String title)
    {
        for(int i = 0; i < catalog.size(); i++)
        {
            if(title.equals(catalog.get(i).getTitle()))
            {
                if(catalog.get(i).isBorrowed())
                {
              
                    System.out.println(title + " is already rented from "
                            + toString());

                    return;
                }

                else
                {
                    System.out.println("You successfully rented " + title
                            + " from " + toString());
                    catalog.get(i).rented();
                    return;
                }
            }
        }

        System.out.println(title + " is not in the catalog at " + toString());
    }

    // Pre: none
    // Post: prints to console whether no books are in the catalog or prints
    //          the list of books (and says if they are currently rented).
    public void printAvailableBooks()
    {
        if(catalog.size() == 0)
        {
            System.out.println("No books in catalog at " + toString());
            return;
        }

        System.out.println("List of books at " + toString() + ":");
        for(int i = 0; i < catalog.size(); i++)
        {
            if(catalog.get(i).isBorrowed())
            {
                System.out.println(catalog.get(i).getTitle()
                        + " (not in stock)");
            }

            else
                System.out.println(catalog.get(i).getTitle());
        }
    }

    // Pre: none
    // Post: book with title is marked as returned and the fine amount is given,
    //          which is FINE * daysLate
    public void returnBook(String title, int daysLate)
    {
        for(int i = 0; i < catalog.size(); i++)
        {
            if(title.equals(catalog.get(i).getTitle()))
                catalog.get(i).returned();
        }

        System.out.println("You successfully returned " + title
                + " to " + toString());
        System.out.println("Your book was " + daysLate + " days late. You owe $"
                + (daysLate * FINE));
    }

    // Pre: none
    // Post: returns String of the Library information
    @Override
    public String toString()
    {
        return "Library (" + address + ")";
    }
}