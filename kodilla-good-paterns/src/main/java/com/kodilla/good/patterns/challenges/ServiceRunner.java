package com.kodilla.good.patterns.challenges;

public class ServiceRunner {

    public static void main(String[] args) {
        OrderGenerator orderGenerator = new OrderGenerator();
        Order order = orderGenerator.generateOrder();

        ProductOrderService productOrderService = new ProductOrderService(new EmailService(),new ProductService(), new NewSale());
        productOrderService.productOrderProcess(order);
    }
}
