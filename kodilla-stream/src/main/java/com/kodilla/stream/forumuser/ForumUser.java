package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final String userName;
    private final char gender;
    private final LocalDate dateOfBirth;
    private final int numbersOfPosts;
    private final String userID;

    public ForumUser(String userName, char gender, LocalDate dateOfBirth, int numbersOfPosts, String userID) {
        this.userName = userName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.numbersOfPosts = numbersOfPosts;
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumbersOfPosts() {
        return numbersOfPosts;
    }

    public String getUserID() {
        return userID;
    }

    @Override
    public String toString() {
        return "Forum User( " +
                "User Name: " + userName +
                ", gender: " + gender +
                ", date of birth: " + dateOfBirth +
                ", numbers of posts: " + numbersOfPosts +
                ')';
    }
}
