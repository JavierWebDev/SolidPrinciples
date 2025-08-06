package org.example

class OldPrinter : Printable, Scanneable { //PrintableFuction
    override fun print() {
        println("Imprimendo...")
    }

    override fun scan() {
        println("Escanenado...")
    }


}