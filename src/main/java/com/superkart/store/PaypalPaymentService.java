package com.superkart.store;

public class PaypalPaymentService implements PaymentService
{
    public void ProcessPayment(double amount)
    {
        System.out.println("Paypal");
        System.out.println("Amount: " + amount);
    }
}
