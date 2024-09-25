package com.kivi.model;

import java.util.ArrayList;
import java.util.Objects;

public class Library {
    private String nameOfLibrary;
    private String address;
    private ArrayList<BookShelf> bookShelfs;

    public Library() {

    }

    public Library(String nameOfLibrary, String address, ArrayList<BookShelf> bookShelfs) {
        this.nameOfLibrary = nameOfLibrary;
        this.address = address;
        this.bookShelfs = bookShelfs;
    }

    public String getNameOfLibrary() {
        return nameOfLibrary;
    }

    public void setNameOfLibrary(String nameOfLibrary) {
        this.nameOfLibrary = nameOfLibrary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<BookShelf> getBookShelfs() {
        return bookShelfs;
    }

    public void setBookShelfs(ArrayList<BookShelf> bookShelfs) {
        this.bookShelfs = bookShelfs;
    }

    public void addBookShelf(BookShelf bookShelf) {
        bookShelfs.add(bookShelf);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Objects.equals(nameOfLibrary, library.nameOfLibrary) && Objects.equals(address, library.address) && Objects.equals(bookShelfs, library.bookShelfs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfLibrary, address, bookShelfs);
    }

    @Override
    public String toString() {
        return "Library{" +
                "nameOfLibrary='" + nameOfLibrary + '\'' +
                ", adress='" + address + '\'' +
                ", bookShelfs=" + bookShelfs +
                '}';
    }
}
