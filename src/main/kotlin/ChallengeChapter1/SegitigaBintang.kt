package ChallengeChapter1

interface Bintang1 {
    fun cetak()
}

class SegitigaSikuBintang(private val tinggi: Int) : Bintang1 {
    override fun cetak() {
        for (i in 1..tinggi) {
            for (j in 1..i) {
                print("* ")
            }
            println()

        }
    }
}

fun main() {
    val bintang: Bintang1 = SegitigaSikuBintang(5)
    bintang.cetak()
}
