package org.example

class NewPrinter : Printable, Scanneable, Faxable { // PrinterFunctions
    override fun print() {
        println("Imprimendo...")
    }

    override fun scan() {
        println("Escanenado...")
    }

    override fun fax() {
        println("Faxing...")
    }
}