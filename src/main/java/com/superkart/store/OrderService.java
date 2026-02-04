package com.superkart.store;

public class OrderService 
{   
    private PaymentService paymentService;

    public OrderService(PaymentService paymentService)
    {
        this.paymentService = paymentService;
    }
    public void PlaceOrder()
    {
        paymentService.ProcessPayment(10);
    }

}
