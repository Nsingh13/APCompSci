package Assignment06;

import java.util.Scanner;

/**
 * Write a description of class RentalSystemRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class RentalSystemRunner
{
    public static void main(String[] args)
    {
    	Scanner scan = new Scanner(System.in);

        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Library operating hours
        String openingHours = "Libraries are open daily from 9am to 5pm.";

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));


        // Print opening hours and the addresses
        System.out.println("Library hours:");
        System.out.println(openingHours);
        // add your implementation
        
        System.out.println("Library addresses:");
        // add your implementation
        firstLibrary.printAddress();
        secondLibrary.printAddress();


        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Which book would you like to borrow? ");
        // add your implementation
        String book = scan.nextLine();
        firstLibrary.borrowBook(book);
        secondLibrary.borrowBook(book);


        // Print the titles of all available books from both libraries
        // add your implementation
        System.out.println("List of books at Library(10 Main St.):");
        firstLibrary.printBooks();
        System.out.println("List of books at Library(228 Liberty St.):");
        secondLibrary.printBooks();
        
        


        // Return The Lords of the Rings to the first library
        System.out.println("Which book would you like to return? ");
        // add your implementation
        book = scan.nextLine();
        System.out.println("How many days late is this?");
        int late = scan.nextInt();
        firstLibrary.returnBook(book, late);


        // Print the titles available from the first library
        // add your implementation
        System.out.println("List of books at Library(10 Main St.):");
        firstLibrary.printBooks();

    }
}