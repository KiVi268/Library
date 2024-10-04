package com.kivi.util;

import com.kivi.model.Library;

import java.awt.print.Book;
import java.util.Random;

public class Generathor {

    private Random random = new Random();
    private StringBuilder randomeString = new StringBuilder();
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    public int getRandomNumber(int min, int max) {
        return random.nextInt((max - min) + 1) + min;
    }

    public String generateRandomString(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            sb.append(CHARACTERS.charAt(randomIndex));
        }
        return sb.toString();
    }

    public String getRandomBook(int min, int max) {
        com.kivi.model.Book book = new com.kivi.model.Book();
        book.setName(generateRandomString(getRandomNumber(min,max)));
        book.setAuthor(generateRandomString(getRandomNumber(min,max)));
        book.setYear(random.nextInt((2024 - 1500) + 1) + 1500);
        return book.toString();
    }

    public int generateBookShelf(int min, int max) {
        return getRandomNumber(min, max);
    }

    public String generateLibrary(int length) {
        Library library = new Library();
        library.setNameOfLibrary(generateRandomString(length));
        library.setAddress(generateRandomString(length));
        return library.toString();
    }
}
