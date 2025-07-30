package org.example

class PushNotification : Notifier {
    override fun sendMessage(message: String) {
        println("TU MENSAJE ES: $message")
    }
}