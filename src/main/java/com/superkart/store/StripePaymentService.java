package com.superkart.store;

public class StripePaymentService implements PaymentService 
{
    @Override
    public void ProcessPayment(double amount)
    {
        System.out.println("Stripe");
        System.out.println("Amount: " +  amount);
    }
}
