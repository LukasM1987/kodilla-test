package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        Forum forum = new Forum(20);
        Map<String, ForumUser> forumUsers = forum.getUsersList()
                .stream().filter(forumUser -> forumUser.getGender() == 'M')
                .filter(forumUser -> forumUser.getDateOfBirth().getYear() <= 2001)
                .filter(forumUser -> forumUser.getNumbersOfPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));
        System.out.println("Map size: " + forumUsers.size());
        forumUsers.entrySet().stream()
                .map(item -> item.getKey() + " - " + item.getValue())
                .forEach(System.out::println);
    }
}
