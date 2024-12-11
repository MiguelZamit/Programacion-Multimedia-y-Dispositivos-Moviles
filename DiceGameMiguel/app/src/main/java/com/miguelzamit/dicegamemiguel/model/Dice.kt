package com.miguelzamit.dicegamemiguel.model

class Dice(faces: Int) {

    var faces: Int = faces
        private set
    var quantityOfThrows: Int = 0
        private set


    constructor() : this(6)

    fun throwDice(): Int {

        ++this.quantityOfThrows
        val result = (1..this.faces).random()

        return result

    }

    // Funcion estatica
    companion object {

        fun throwDiceNFaces(faces: Int): Int {

            return (1..faces).random()

        }

    }


    override fun toString(): String {

        return "Numero de caras del dado: ${this.faces}, cantidad de tiradas: ${this.quantityOfThrows}\n"

    }
}