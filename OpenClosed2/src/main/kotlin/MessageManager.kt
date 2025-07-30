package org.example

class MessageManager(val notifier: Notifier) {
    fun sendMessage(msg: String) {
        notifier.sendMessage(msg)
    }
}