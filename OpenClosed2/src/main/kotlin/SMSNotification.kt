package org.example

class SMSNotification : Notifier {
    override fun sendMessage(message: String) {
        println("TU SMS NUEVO ES: $message")
    }
}