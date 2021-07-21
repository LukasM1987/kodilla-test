package com.kodilla.testing.statistics;

public class CalculateStatistics {

    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averageUserPosts;
    private double averageUserComments;
    private double averageCommentsPerPost;

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAverageUserPosts() {
        return averageUserPosts;
    }

    public double getAverageUserComments() {
        return averageUserComments;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();

        if (numberOfPosts == 0) {
            numberOfComments = 0;
        } else {
            numberOfComments = statistics.commentsCount();
        }

        if (numberOfComments == 0 || numberOfUsers == 0) {
            averageUserComments = 0.0;
        } else {
            averageUserComments = (double) numberOfComments / numberOfUsers;
        }

        if (numberOfPosts == 0 || numberOfUsers == 0) {
            averageUserPosts = 0.0;
        } else {
            averageUserPosts = (double) numberOfPosts / numberOfUsers;
        }

        if (numberOfComments == 0 || numberOfPosts == 0) {
            averageCommentsPerPost = 0.0;
        } else {
            averageCommentsPerPost = (double) numberOfComments / numberOfPosts;
        }
    }

    public void showStatistics() {
        System.out.println("Number of users: " + numberOfUsers);
        System.out.println("Number of posts: " + numberOfPosts);
        System.out.println("Number of comments: " + numberOfComments);
        System.out.println("Average number of posts per user: " + averageUserPosts);
        System.out.println("Average number of comments per user: " + averageUserComments);
        System.out.println("Average number of comments per post: " + averageCommentsPerPost);
    }
}
