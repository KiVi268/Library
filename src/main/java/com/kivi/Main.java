package com.kivi;

import com.kivi.model.Book;
import com.kivi.model.BookShelf;
import com.kivi.model.Library;
import com.kivi.util.Generathor;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Generathor gen = new Generathor();
        System.out.println(gen.getRandomNumber(12, 29));
        System.out.println(gen.getRandomBook(11, 36));
        System.out.println(gen.generateLibrary(15));
        System.out.println(gen.generateBookShelf(1, 12));


        // Test 1: Testing the default constructor and setter methods
        Book book1 = new Book();
        book1.setName("1984");
        book1.setAuthor("George Orwell");
        book1.setYear(1949);

        System.out.println("Test 1: Book created using default constructor and setters:");
        System.out.println(book1.toString());
        System.out.println();

        // Test 2: Testing the parameterized constructor
        Book book2 = new Book("Brave New World", "Aldous Huxley", 1932);
        System.out.println("Test 2: Book created using parameterized constructor:");
        System.out.println(book2.toString());
        System.out.println();

        // Test 3: Testing the equals method
        Book book3 = new Book("1984", "George Orwell", 1949);
        System.out.println("Test 3: Testing equals method:");
        System.out.println("book1 equals book3: " + book1.equals(book3));  // should return true
        System.out.println("book1 equals book2: " + book1.equals(book2));  // should return false
        System.out.println();

        // Test 4: Testing the hashCode method
        System.out.println("Test 4: Testing hashCode method:");
        System.out.println("book1.hashCode() == book3.hashCode(): " + (book1.hashCode() == book3.hashCode())); // should be true
        System.out.println("book1.hashCode() == book2.hashCode(): " + (book1.hashCode() == book2.hashCode())); // should be false
        System.out.println();

        // Test 5: Testing the getters
        System.out.println("Test 5: Testing getters:");
        System.out.println("Name: " + book1.getName());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Year: " + book1.getYear());

        // Test 1: Testing the default constructor and adding books
        BookShelf shelf1 = new BookShelf();
        shelf1.setNumber(1);
        shelf1.setBooksOnShelf(new ArrayList<>());


        shelf1.add(book1);
        shelf1.add(book2);

        System.out.println("Test 1: BookShelf created using default constructor and adding books:");
        System.out.println(shelf1.toString());
        System.out.println();

        // Test 2: Testing the parameterized constructor and adding books
        ArrayList<Book> booksOnShelf = new ArrayList<>();
        booksOnShelf.add(new Book("1984", "George Orwell", 1949));
        booksOnShelf.add(new Book("Brave New World", "Aldous Huxley", 1932));

        BookShelf shelf2 = new BookShelf(2, booksOnShelf);
        System.out.println("Test 2: BookShelf created using parameterized constructor:");
        System.out.println(shelf2.toString());
        System.out.println();

        // Test 3: Testing the searchBook method (index search)
        System.out.println("Test 3: Searching for a book by index:");
        int bookIndex = shelf1.searchBook(book1);  // should return the index of book1
        System.out.println("Index of 'The Catcher in the Rye' on shelf1: " + bookIndex);
        System.out.println();

        // Test 4: Testing the searchBooksByObject method (search by equality)
        System.out.println("Test 4: Searching for a book by object:");
        Book foundBook = shelf1.searchBooksByObject(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
        System.out.println("Found book: " + foundBook);
        System.out.println();

        // Test 5: Testing the deleteBook method
        System.out.println("Test 5: Deleting a book from the shelf:");
        shelf1.deleteBook(book1);
        System.out.println("After deleting 'The Catcher in the Rye':");
        System.out.println(shelf1.toString());
        System.out.println();

        // Test 6: Testing the equals method
        System.out.println("Test 6: Testing equals method:");
        BookShelf shelf3 = new BookShelf(2, new ArrayList<>(booksOnShelf));
        System.out.println("shelf2 equals shelf3: " + shelf2.equals(shelf3)); // should return true
        System.out.println("shelf1 equals shelf2: " + shelf1.equals(shelf2)); // should return false
        System.out.println();

        // Test 7: Testing the hashCode method
        System.out.println("Test 7: Testing hashCode method:");
        System.out.println("shelf2.hashCode() == shelf3.hashCode(): " + (shelf2.hashCode() == shelf3.hashCode())); // should return true
        System.out.println();

        Library library1 = new Library();
        library1.setNameOfLibrary("City Library");
        library1.setAddress("123 Main Street");
        library1.setBookShelfs(new ArrayList<>());

        shelf1 = new BookShelf(1, new ArrayList<>());
        shelf1.add(new Book("1984", "George Orwell", 1949));
        shelf1.add(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
        library1.addBookShelf(shelf1);

        System.out.println("Test 1: Library created using default constructor and adding BookShelfs:");
        System.out.println(library1.toString());
        System.out.println();

        // Test 2: Creating a library using the parameterized constructor
        ArrayList<BookShelf> bookShelfs = new ArrayList<>();
        bookShelfs.add(shelf1);
        Library library2 = new Library("Community Library", "456 Oak Avenue", bookShelfs);

        System.out.println("Test 2: Library created using parameterized constructor:");
        System.out.println(library2.toString());
        System.out.println();

        // Test 3: Finding a book by name in the library
        System.out.println("Test 3: Searching for a book by name:");
        foundBook = library1.findBookByName("1984");  // Should return the book object
        System.out.println("Found book: " + foundBook);
        System.out.println();

        // Test 4: Finding a bookshelf by object
        System.out.println("Test 4: Searching for a bookshelf by object:");
        BookShelf foundShelf = library1.findShelfByObject(shelf1);  // Should return the shelf
        System.out.println("Found shelf: " + foundShelf);
        System.out.println();

        // Test 5: Adding another bookshelf and searching it
        shelf2.add(new Book("Brave New World", "Aldous Huxley", 1932));
        library1.addBookShelf(shelf2);

        System.out.println("Test 5: After adding another bookshelf:");
        System.out.println(library1.toString());
        System.out.println();

        // Test 6: Deleting a bookshelf from the library
        System.out.println("Test 6: Deleting a bookshelf:");
        library1.deleteBookShelf(shelf1);
        System.out.println("After deleting shelf1:");
        System.out.println(library1.toString());
        System.out.println();

        // Test 7: Testing equals method
        System.out.println("Test 7: Testing equals method:");
        Library library3 = new Library("Community Library", "456 Oak Avenue", new ArrayList<>(bookShelfs));
        System.out.println("library2 equals library3: " + library2.equals(library3));  // should return true
        System.out.println("library1 equals library2: " + library1.equals(library2));  // should return false
        System.out.println();

        // Test 8: Testing hashCode method
        System.out.println("Test 8: Testing hashCode method:");
        System.out.println("library2.hashCode() == library3.hashCode(): " + (library2.hashCode() == library3.hashCode()));  // should return true
        System.out.println();
    }
}