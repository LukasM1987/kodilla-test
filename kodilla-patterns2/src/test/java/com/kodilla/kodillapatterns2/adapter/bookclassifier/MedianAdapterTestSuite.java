package com.kodilla.kodillapatterns2.adapter.bookclassifier;

import com.kodilla.kodillapatterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya.BookA;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest() {
        //Given
        Set<BookA> books = new HashSet<>();
        books.add(new BookA("Author 1", "Title 1", 2000, "sfsdfa"));
        books.add(new BookA("Author 2", "Title 2", 2001, "dfgadf"));
        books.add(new BookA("Author 3", "Title 3", 2002, "swerew"));
        books.add(new BookA("Author 4", "Title 4", 2003, "sgsbfs"));
        books.add(new BookA("Author 5", "Title 5", 2004, "swwefe"));
        books.add(new BookA("Author 6", "Title 6", 2005, "sfilil"));
        books.add(new BookA("Author 7", "Title 7", 2006, "qweqwe"));
        books.add(new BookA("Author 8", "Title 8", 2006, "bncdhb"));
        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int medianYear = medianAdapter.publicationYearMedian(books);

        //Then
        Assertions.assertEquals(2004, medianYear);
    }
}
