package com.kodilla.testing.library;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
@ExtendWith(MockitoExtension.class)
public class BookDirectoryTestSuite {

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Mock
    private LibraryDatabase libraryDatabaseMock;

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> books = new ArrayList<>();
        for (int i = 0; i < booksQuantity; i++) {
            books.add(new Book("Title: " + i, "Author: " + i, 1970 + i));
        }
        return books;
    }

    @Test
    void testListBooksWithConditionsReturnList() {
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> books = new ArrayList<>();
        books.add(new Book("Secrets of Alamo", "John Smith", 2008));
        books.add(new Book("Secretaries and Directors", "Dilbert Michigan", 2012));
        books.add(new Book("Secret life of programmers", "Steve Wolkowitz", 2016));
        books.add(new Book("Secrets of Java", "Ian Tenewitch", 2010));
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(books);
        assertEquals(4, bookLibrary.listBooksWithCondition("Secret").size());
    }

    @Test
    void testListBooksWithConditionMoreThan20() {
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    void testListBooksWithConditionFragmentShorterThan3() {
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    void testBorrowBook0(){
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser user = new LibraryUser("asfasfd", "dsfdasfad", "1234567890");
        List<Book> userBooks = bookLibrary.listBooksInHandsOf(user);
        assertEquals(0,userBooks.size());
    }

    @Test
    void testBorrowBook1(){
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser user = new LibraryUser("xyz", "xyz", "12345678890");
        Book book = new Book("adgadga", "adgdagad", 1987);
        user.userBorrows.add(book);
        List<Book> userBooks = bookLibrary.listBooksInHandsOf(user);
        assertEquals(1,userBooks.size());
    }

    @Test
    void testBorrowBook5() {
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser user = new LibraryUser("xyz", "xyz", "1234567890");
        Book book = new Book("asfasf", "sdfsdf", 2000);
        Book book2 = new Book("asadfsdf", "sdfsdf", 2001);
        Book book3 = new Book("sdfsdf", "dhdhdf", 2002);
        Book book4 = new Book("sdfsdfs", "sdfsdfs", 2003);
        Book book5 = new Book("sdfsdf", "sdfsdfsd", 2004);
        user.userBorrows.add(book);
        user.userBorrows.add(book2);
        user.userBorrows.add(book3);
        user.userBorrows.add(book4);
        user.userBorrows.add(book5);
        List<Book> userBooks = bookLibrary.listBooksInHandsOf(user);
        assertEquals(5,userBooks.size());
    }
}