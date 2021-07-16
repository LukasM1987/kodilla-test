package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LibraryUser {

    private String name;
    private String lastName;
    private String peselId;
    private List<Book> userBorrows = new ArrayList<>();

    public LibraryUser(String name, String lastName, String peselId) {
        this.name = name;
        this.lastName = lastName;
        this.peselId = peselId;
    }

    public List<Book> getUserBorrows() {
        return userBorrows;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPeselId() {
        return peselId;
    }

    public void setPeselId(String peselId) {
        this.peselId = peselId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LibraryUser that = (LibraryUser) o;
        return Objects.equals(name, that.name) && Objects.equals(lastName, that.lastName)
                && Objects.equals(peselId, that.peselId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, peselId);
    }
}
