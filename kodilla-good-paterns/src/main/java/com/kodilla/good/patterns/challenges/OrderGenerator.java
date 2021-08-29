package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.util.Random;

public class OrderGenerator {

    private static final Random random = new Random();
    private static final char[] chars = {'a', 'b', 'c', 'd', 'f', 'e', 'g', 't', 'q', 'y', '6', '3', '7', '2', '1', '5'};

    public Order generateOrder() {
        Order order = new Order(generateUser(), generateProduct(), LocalDate.now());
        return order;
    }

    private User generateUser() {
        String userName = "";
        String userEmail = "";
        int nameLength = random.nextInt(chars.length) + 5;
        int emailLength = random.nextInt(chars.length) + 5;
        for (int i = 0; i < nameLength; i++) {
            int randomChar = random.nextInt(chars.length);
            userName = userName + chars[randomChar];
        }

        for (int i = 0; i < emailLength; i++) {
            int randomChar = random.nextInt(chars.length);
            userEmail = userEmail + chars[randomChar];
        }
        userEmail = userEmail + "@gmail.com";

        return new User(userName, userEmail );
    }

    private Product generateProduct() {
        String productName = "";
        int price = random.nextInt(900) + 100;
        int productLength = random.nextInt(chars.length) + 5;
        for (int i = 0; i < productLength; i++) {
            int randomChar = random.nextInt(chars.length);
            productName = productName + chars[randomChar];
        }
        double finalPrice = price - 0.01;
        return new Product(productName, finalPrice);
    }
}
