package com.kivi.model;

import java.util.ArrayList;
import java.util.Objects;

public class BookShelf {
    private int number;
    private ArrayList<Book> booksOnShelf;

    public BookShelf() {
    }

    public BookShelf(int number, ArrayList<Book> booksOnShelf) {
        this.number = number;
        this.booksOnShelf = booksOnShelf;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ArrayList<Book> getBooksOnShelf() {
        return booksOnShelf;
    }

    public void setBooksOnShelf(ArrayList<Book> booksOnShelf) {
        this.booksOnShelf = booksOnShelf;
    }

    public void add(Book book) {
        booksOnShelf.add(book);
    }

    public int searchBook(Book book) {
            return booksOnShelf.indexOf(book);
    }

    public Book searchBooksByObject(Book book) {
        for (Book name : booksOnShelf) {
            if (name.equals(book)) {
                return booksOnShelf.get(searchBook(name));
            }
        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookShelf bookShelf = (BookShelf) o;
        return number == bookShelf.number && Objects.equals(booksOnShelf, bookShelf.booksOnShelf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, booksOnShelf);
    }

    @Override
    public String toString() {
        return "BookShelf{" +
                "number=" + number +
                ", booksOnShelf=" + booksOnShelf +
                '}';
    }
}
