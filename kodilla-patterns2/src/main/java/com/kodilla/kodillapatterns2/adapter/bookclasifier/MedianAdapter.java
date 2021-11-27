package com.kodilla.kodillapatterns2.adapter.bookclasifier;

import com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.Book;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya.Book> bookSet) {
        Map<BookSignature, Book> books = new HashMap<>();
        for (com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya.Book item : bookSet){
            books.put(new BookSignature(item.getSignature()), new Book(item.getAuthor(), item.getTitle(), item.getPublicationYear()));
        }
        return medianPublicationYear(books);
    }
}
