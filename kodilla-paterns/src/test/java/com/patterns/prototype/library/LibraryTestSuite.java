package com.patterns.prototype.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    public void addBookToLibraryTest() {
        //Given
        Library library = new Library("Library 1");
        IntStream.iterate(1, i -> i + 1)
                .limit(10)
                .forEach(i -> library.getBooks().add(new Book("Title: " + i, "Author: " + i, LocalDate.now())));

        Library shallowClone = null;
        try {
            shallowClone = library.shallowCopy();
            shallowClone.setName("Library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClone = null;
        try {
            deepClone = library.deepCopy();
            deepClone.setName("Library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().add(new Book("Title: 11", "Author: 11", LocalDate.now()));

        //Then
        Assertions.assertEquals(11, library.getBooks().size());
        Assertions.assertEquals(11, shallowClone.getBooks().size());
        Assertions.assertEquals(10, deepClone.getBooks().size());
        Assertions.assertEquals(shallowClone.getBooks(), library.getBooks());
        Assertions.assertNotEquals(deepClone.getBooks(), library.getBooks());
    }

    @Test
    void removeBookFromLibraryTest(){
        //Given
        Library library = new Library("Library 1");
        IntStream.iterate(1, i -> i + 1)
                .limit(10)
                .forEach(i -> library.getBooks().add(new Book("Title: " + i, "Author: " + i, LocalDate.of(2001, 1, 1))));

        Library shallowClone = null;
        try {
            shallowClone = library.shallowCopy();
            shallowClone.setName("Library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClone = null;
        try {
            deepClone = library.deepCopy();
            deepClone.setName("Library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(new Book("Title: 6", "Author: 6", LocalDate.of(2001, 1, 1)));

        //Then
        Assertions.assertEquals(9, library.getBooks().size());
        Assertions.assertEquals(9, shallowClone.getBooks().size());
        Assertions.assertEquals(10, deepClone.getBooks().size());
        Assertions.assertEquals(shallowClone.getBooks(), library.getBooks());
        Assertions.assertNotEquals(deepClone.getBooks(), library.getBooks());
    }
}
