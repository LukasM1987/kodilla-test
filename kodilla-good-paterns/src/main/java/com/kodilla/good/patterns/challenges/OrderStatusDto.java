package com.kodilla.good.patterns.challenges;

public class OrderStatusDto {

    private final User user;
    private final boolean isSuccess;

    public OrderStatusDto(User user, boolean isSuccess) {
        this.user = user;
        this.isSuccess = isSuccess;
    }

    public User getUser() {
        return user;
    }

    public boolean isSuccess() {
        return isSuccess;
    }
}
