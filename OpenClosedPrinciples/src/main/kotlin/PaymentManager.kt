package org.example

class PaymentManager(val payment: Payment) {
    fun pay(amount: Double) {
        payment.processPayment(amount)
    }
}