package org.example

open class Sparrow : Bird(), FlyingBird {
    override fun fly() {
        println("Volandoooo!")
    }
}