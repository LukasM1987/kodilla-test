package com.kodilla.good.patterns.challenges;

import java.util.Random;

public class ProductOrderService {

    private static final Random isInWarehouse = new Random();

    private InformationService informationService;
    private SaleService saleService;
    private SaleRepository saleRepository;

    public ProductOrderService(InformationService informationService, SaleService saleService, SaleRepository saleRepository) {
        this.informationService = informationService;
        this.saleService = saleService;
        this.saleRepository = saleRepository;
    }

    public void productOrderProcess(Order order) {
        boolean isTransaction = saleService.order(order.getUser(), order.getProduct(), order.getDateOfSale(), isInWarehouse.nextBoolean());

        if(isTransaction) {
            informationService.information(order.getUser(), order.getProduct(), order.getDateOfSale(), true);
            saleRepository.createSaleRepository(order.getUser(), order.getProduct(), order.getDateOfSale());
        } else {
            informationService.information(order.getUser(), order.getProduct(), order.getDateOfSale(), false);
        }
    }
}