package org.example

public interface Payment {
    fun processPayment(price : Double)
}

class CreditCardPayment : Payment {
    override fun processPayment(price: Double) {
        println("Procesando el valor $price con tarjeta de credito")
    }
}

class CryptoPayment : Payment {
    override fun processPayment(price: Double) {
        println("Procesando el valor $price con cryptomoneda")
    }
}

class PaypalPayment : Payment {
    override fun processPayment(price: Double) {
        println("Procesando el valor $price con PayPal")
    }
}