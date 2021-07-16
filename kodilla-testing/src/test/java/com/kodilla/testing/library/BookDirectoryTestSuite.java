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
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> books = new ArrayList<>();
        books.add(new Book("Secrets of Alamo", "John Smith", 2008));
        books.add(new Book("Secretaries and Directors", "Dilbert Michigan", 2012));
        books.add(new Book("Secret life of programmers", "Steve Wolkowitz", 2016));
        books.add(new Book("Secrets of Java", "Ian Tenewitch", 2010));

        //When
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(books);

        //Then
        assertEquals(4, bookLibrary.listBooksWithCondition("Secret").size());
    }

    @Test
    void testListBooksWithConditionMoreThan20() {
        //Given
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

        //When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");

        //Then
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    void testListBooksWithConditionFragmentShorterThan3() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        //When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        //Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    void testBorrowBook0(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser user = new LibraryUser("asfasfd", "dsfdasfad", "1234567890");

        //When
        List<Book> userBooks = bookLibrary.listBooksInHandsOf(user);

        //Then
        assertEquals(0,userBooks.size());
    }

    @Test
    void testBorrowBook1(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser user = new LibraryUser("xyz", "xyz", "12345678890");
        Book book = new Book("adgadga", "adgdagad", 1987);
        user.getUserBorrows().add(book);

        //When
        List<Book> userBooks = bookLibrary.listBooksInHandsOf(user);

        //Then
        assertEquals(1,userBooks.size());
    }

    @Test
    void testBorrowBook5() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser user = new LibraryUser("xyz", "xyz", "1234567890");
        Book book = new Book("asfasf", "sdfsdf", 2000);
        Book book2 = new Book("asadfsdf", "sdfsdf", 2001);
        Book book3 = new Book("sdfsdf", "dhdhdf", 2002);
        Book book4 = new Book("sdfsdfs", "sdfsdfs", 2003);
        Book book5 = new Book("sdfsdf", "sdfsdfsd", 2004);
        user.getUserBorrows().add(book);
        user.getUserBorrows().add(book2);
        user.getUserBorrows().add(book3);
        user.getUserBorrows().add(book4);
        user.getUserBorrows().add(book5);

        //When
        List<Book> userBooks = bookLibrary.listBooksInHandsOf(user);

        //Then
        assertEquals(5,userBooks.size());
    }
}