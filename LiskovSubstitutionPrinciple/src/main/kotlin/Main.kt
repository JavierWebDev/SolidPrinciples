package org.example

fun main() {
    var bird1 = Bird()
    var birds = mutableListOf(bird1)

    makeSoundAll(birds)

    var sparrow1 = Sparrow()
    var sparrows = mutableListOf(sparrow1)

    makeFly(sparrows)

    var penguin = Penguin()
    var penguins = mutableListOf(penguin)

    // Test Para ver si se pueden sustituir

    makeSoundAll(sparrows)
    makeSoundAll(penguins)

    // makeFly(birds - penguins) NO FUNCIONA

}

fun makeSoundAll(birds: List<Bird>) {
    for (bird in birds) {
        bird.makeSound()
    }
}

fun makeFly(birds: List<Sparrow>) {
    for (bird in birds) {
        bird.fly()
    }
}