package com.raffenio.module4.my.solution.one;

// It is part of a fictional legacy e-commerce application with a
// CheckoutController class that has a method processOrder that
// handles the checkout process, including calculating the total
// amount, applying discounts, and processing the payment.
// The method has grown too large and contains too much functionality.
// Refactor the method to make it more concise and easier to maintain.
// The actual implementation is left out for simplicity.
// The solution can also just contain comments in the extracted methods.


import com.raffenio.module4.my.solution.Order;

public class CheckoutController {

    public void processOrder(Order order) {

        //-> order
        // calculate the total amount
        double totalAmount = calculateTotalAmount(order);
        // apply any discounts

        //-> payments service
        // process the payment

        //->email service
        // send confirmation emails

        //->inventory
        // update the inventory

        //->order
        // update the order status
    }


    private double calculateTotalAmount(Order order){
        // calculate the total amount
        return 0d;
    }
}

