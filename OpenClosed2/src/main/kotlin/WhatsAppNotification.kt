package org.example

class WhatsAppNotification : Notifier {
    override fun sendMessage(message: String) {
        println("TIENES UN MENSAJE DE WHATSAPP: $message")
    }
}