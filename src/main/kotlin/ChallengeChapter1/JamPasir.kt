package ChallengeChapter1

//MENERAPKAN PRINSIP OOP

open class Model {
    open fun draw() {
    }
}

open class Segitiga(val n: Int) : Model() {
    override fun draw() {

    }
}

class SegitigaAtas(n: Int) : Segitiga(n) {
    override fun draw() {
        for (i in 1..n) {
            for (j in i..n) {
                print(" ")
            }
            for (k in 1..(2*i-1)) {
                print("*")
            }
            println()
        }
    }
}

class SegitigaBawah(n: Int) : Segitiga(n) {
    override fun draw() {
        for (i in n downTo 1) {
            for (j in i..n) {
                print(" ")
            }
            for (k in 1..(2*i-1)) {
                print("*")
            }
            println()
        }
    }
}

class Pola {
    fun printSegitigaAtasBawah(n: Int) {
        val topTriangle = SegitigaAtas(n)
        val bottomTriangle = SegitigaBawah(n)
        topTriangle.draw()
        bottomTriangle.draw()
    }
}

fun main() {
    val pattern = Pola()
    pattern.printSegitigaAtasBawah(8)
}
