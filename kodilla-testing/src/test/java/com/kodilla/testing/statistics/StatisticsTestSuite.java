package com.kodilla.testing.statistics;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class TotalStatisticsTestSuite {


    private List<String> generateUsers(int size){
        List <String> users = new ArrayList<>();

        for (int i = 0; i < size; i++){
            users.add("User name: " + i);
        }
        return users;
    }

    @Test
    public void testCalculateStatisticsWhenPostIs0(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics statistics = new CalculateStatistics();

        when(statisticsMock.usersNames()).thenReturn(generateUsers(10));
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(2);

        //When
        statistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(0, statistics.getNumberOfComments());
        Assertions.assertEquals(0, statistics.getNumberOfPosts());
        Assertions.assertEquals(10, statistics.getNumberOfUsers());
        Assertions.assertEquals(0, statistics.getAverageCommentsPerPost(), 0.01);
        Assertions.assertEquals(0, statistics.getAverageUserComments(), 0.01);
        Assertions.assertEquals(0, statistics.getAverageUserPosts(), 0.01);
    }

    @Test
    public void testCalculateStatisticsWhenPostIs1000(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics statistics = new CalculateStatistics();

        when(statisticsMock.usersNames()).thenReturn(generateUsers(10));
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(20);

        //When
        statistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(20, statistics.getNumberOfComments());
        Assertions.assertEquals(1000, statistics.getNumberOfPosts());
        Assertions.assertEquals(10, statistics.getNumberOfUsers());
        Assertions.assertEquals(0.02, statistics.getAverageCommentsPerPost(), 0.01);
        Assertions.assertEquals(2.0, statistics.getAverageUserComments(), 0.01);
        Assertions.assertEquals(100, statistics.getAverageUserPosts(), 0.01);
    }

    @Test
    public void testCalculateStatisticsWhenCommentsIs0(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics statistics = new CalculateStatistics();

        when(statisticsMock.usersNames()).thenReturn(generateUsers(10));
        when(statisticsMock.postsCount()).thenReturn(5);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        statistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(0, statistics.getNumberOfComments());
        Assertions.assertEquals(5, statistics.getNumberOfPosts());
        Assertions.assertEquals(10, statistics.getNumberOfUsers());
        Assertions.assertEquals(0, statistics.getAverageCommentsPerPost(), 0.01);
        Assertions.assertEquals(0, statistics.getAverageUserComments(), 0.01);
        Assertions.assertEquals(0.5, statistics.getAverageUserPosts(), 0.01);
    }

    @Test
    public void testCalculateStatisticsWhenPostsAreMoreThenComments(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics statistics = new CalculateStatistics();

        when(statisticsMock.usersNames()).thenReturn(generateUsers(10));
        when(statisticsMock.postsCount()).thenReturn(20);
        when(statisticsMock.commentsCount()).thenReturn(5);

        //When
        statistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(5, statistics.getNumberOfComments());
        Assertions.assertEquals(20, statistics.getNumberOfPosts());
        Assertions.assertEquals(10, statistics.getNumberOfUsers());
        Assertions.assertEquals(0.25, statistics.getAverageCommentsPerPost(), 0.01);
        Assertions.assertEquals(0.5, statistics.getAverageUserComments(), 0.01);
        Assertions.assertEquals(2.0, statistics.getAverageUserPosts(), 0.01);
    }

    @Test
    public void testCalculateStatisticsWhenCommentsAreMoreThenPosts(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics statistics = new CalculateStatistics();

        when(statisticsMock.usersNames()).thenReturn(generateUsers(10));
        when(statisticsMock.postsCount()).thenReturn(5);
        when(statisticsMock.commentsCount()).thenReturn(20);

        //When
        statistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(20, statistics.getNumberOfComments());
        Assertions.assertEquals(5, statistics.getNumberOfPosts());
        Assertions.assertEquals(10, statistics.getNumberOfUsers());
        Assertions.assertEquals(4.0, statistics.getAverageCommentsPerPost(), 0.01);
        Assertions.assertEquals(2.0, statistics.getAverageUserComments(), 0.01);
        Assertions.assertEquals(0.5, statistics.getAverageUserPosts(), 0.01);
    }

    @Test
    public void testCalculateStatisticsWhenUsersIs0(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics statistics = new CalculateStatistics();

        when(statisticsMock.usersNames()).thenReturn(generateUsers(0));
        when(statisticsMock.postsCount()).thenReturn(20);
        when(statisticsMock.commentsCount()).thenReturn(5);

        //When
        statistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(5, statistics.getNumberOfComments());
        Assertions.assertEquals(20, statistics.getNumberOfPosts());
        Assertions.assertEquals(0, statistics.getNumberOfUsers());
        Assertions.assertEquals(0.25, statistics.getAverageCommentsPerPost(), 0.01);
        Assertions.assertEquals(0, statistics.getAverageUserComments(), 0.01);
        Assertions.assertEquals(0, statistics.getAverageUserPosts(), 0.01);
    }

    @Test
    public void testCalculateStatisticsWhenUsersIs100(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics statistics = new CalculateStatistics();

        when(statisticsMock.usersNames()).thenReturn(generateUsers(100));
        when(statisticsMock.postsCount()).thenReturn(20);
        when(statisticsMock.commentsCount()).thenReturn(5);

        //When
        statistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(5, statistics.getNumberOfComments());
        Assertions.assertEquals(20, statistics.getNumberOfPosts());
        Assertions.assertEquals(100, statistics.getNumberOfUsers());
        Assertions.assertEquals(0.25, statistics.getAverageCommentsPerPost(), 0.01);
        Assertions.assertEquals(0.05, statistics.getAverageUserComments(), 0.01);
        Assertions.assertEquals(0.2, statistics.getAverageUserPosts(), 0.01);
    }
}