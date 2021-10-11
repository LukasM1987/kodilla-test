package com.kodilla.kodilla.hibernate.invoice.dao;

import com.kodilla.kodilla.hibernate.invoice.Invoice;
import com.kodilla.kodilla.hibernate.invoice.Item;
import com.kodilla.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.math.BigDecimal;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Invoice invoice = new Invoice("1");
        Product product1 = new Product("Product 1");
        Product product2 = new Product("Product 2");
        Product product3 = new Product("Product 3");
        Product product4 = new Product("Product 4");
        Product product5 = new Product("Product 5");
        Product product6 = new Product("Product 6");
        Item item1 = new Item(product1, invoice, new BigDecimal("5"), 2);
        Item item2 = new Item(product2, invoice, new BigDecimal("4"), 5);
        Item item3 = new Item(product3, invoice, new BigDecimal("4"), 25);
        Item item4 = new Item(product4, invoice, new BigDecimal("15"), 45);
        Item item5 = new Item(product4, invoice, new BigDecimal("15"), 5);
        Item item6 = new Item(product5, invoice, new BigDecimal("13"), 4);
        Item item7 = new Item(product6, invoice, new BigDecimal("12"), 3);
        Item item8 = new Item(product6, invoice, new BigDecimal("11"), 2);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        invoice.getItems().add(item4);
        invoice.getItems().add(item5);
        invoice.getItems().add(item6);
        invoice.getItems().add(item7);
        invoice.getItems().add(item8);

        //When
        int invoiceId = invoiceDao.save(invoice).getId();

        //Then
        Assertions.assertNotEquals(0, invoiceId);

        //CleanUp
        //invoiceDao.deleteById(invoiceId);
    }
}
