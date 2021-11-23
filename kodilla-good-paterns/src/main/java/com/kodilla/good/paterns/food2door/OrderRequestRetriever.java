package com.kodilla.good.paterns.food2door;

public class OrderRequestRetriever {

    private ProductFilter productFilter = new ProductFilter();
    private Product product;

    public OrderRequest retrieve(Shop shop, int productNumber, String productName) {
        if (productFilter.searchInExtraFoodShop(productName)) {
            product = shop.getProducts().get(productNumber);
            print(shop.getShopName(), product.getName(), product.getQuantity(), product.getPrice());
            return new OrderRequest(shop, product);
        }

        if (productFilter.searchInGlutenShop(productName)) {
            product = shop.getProducts().get(productNumber);
            print(shop.getShopName(), product.getName(), product.getQuantity(), product.getPrice());
            return new OrderRequest(shop, product);
        }

        if (productFilter.searchInHealthyShop(productName)) {
            product = shop.getProducts().get(productNumber);
            print(shop.getShopName(), product.getName(), product.getQuantity(), product.getPrice());
            return new OrderRequest(shop, product);
        }
        return null;
    }

    private void print(String shopName, String productName, int productQuantity, double productPrice) {
        System.out.println("Shop: " + shopName);
        System.out.println("Product: " + productName);
        System.out.println("Quantity: " + productQuantity);
        System.out.println("Price: " + (productPrice * productQuantity));
    }
}
