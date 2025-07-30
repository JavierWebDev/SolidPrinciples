package org.example

fun main() {
    val pushNotification = MessageManager(PushNotification())
    val whatsAppNotification = MessageManager(WhatsAppNotification())
    val smsNotification = MessageManager(SMSNotification())

    pushNotification.sendMessage("PUSH MESSAGE")
    whatsAppNotification.sendMessage("WHATSAPP MESSAGE")
    smsNotification.sendMessage("NUEVO SMS")

}