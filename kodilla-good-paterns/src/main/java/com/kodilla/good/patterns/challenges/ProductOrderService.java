package com.kodilla.good.patterns.challenges;

import java.util.Random;

public class ProductOrderService {

    private static final Random warehouseAvailability = new Random();

    private InformationService informationService;
    private SaleService saleService;
    private SaleRepository saleRepository;

    public ProductOrderService(final InformationService informationService, final SaleService saleService, final SaleRepository saleRepository) {
        this.informationService = informationService;
        this.saleService = saleService;
        this.saleRepository = saleRepository;
    }

    public OrderStatusDto productOrderProcess(final Order order) {
        boolean ordered = saleService.order(order.getUser(), order.getProduct(), order.getDateOfSale(), warehouseAvailability.nextBoolean());

        if(ordered) {
            informationService.inform(order.getUser(), order.getProduct(), order.getDateOfSale(), true);
            saleRepository.printSaleSummary(order.getUser(), order.getProduct(), order.getDateOfSale());
            saleRepository.addOrderToRepository(order);
            return new OrderStatusDto(order.getUser(), true);
        } else {
            informationService.inform(order.getUser(), order.getProduct(), order.getDateOfSale(), false);
            return new OrderStatusDto(order.getUser(),false);
        }
    }
}
