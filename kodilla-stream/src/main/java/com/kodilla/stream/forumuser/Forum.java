package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class Forum {

    private final List<ForumUser> users = new ArrayList<>();
    private static final Random random = new Random();
    private static final char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'r', 's', 't','u', 'w', 'y','z'};
    private static final char[] genders = {'M', 'F'};

    public Forum(int usersSize) {
        for (int i = 0; i < usersSize; i++) {
            String userName = "";
            int randomNameLength = random.nextInt(10) + 4;
            for (int j = 0; j < randomNameLength; j++) {
                int name = random.nextInt(chars.length);
                userName = userName + chars[name];
            }
            int randomGender = random.nextInt(genders.length);
            int day = random.nextInt(28) + 1;
            int month = random.nextInt(12) + 1;
            int year = random.nextInt(31) + 1990;
            LocalDate dateOfBirth = LocalDate.of(year, month, day);
            int numbersOfPosts = random.nextInt(11);
            users.add(new ForumUser(userName, genders[randomGender], dateOfBirth, numbersOfPosts, "00" + i));
        }
    }

    public List<ForumUser> getUsersList() {
        return new ArrayList<>(users);
    }
}