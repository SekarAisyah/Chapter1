package ChallengeChapter1

interface Bintangku {
    fun cetak()
}

class PiramidaBintang (private val tinggi: Int) : Bintangku {
    override fun cetak() {
        for (i in 1..tinggi) {
            for (j in 1..(tinggi - i)) {
                print("  ")
            }
            for (j in 1..(2 * i - 1)) {
                print("* ")
            }
            println()
        }
    }
}

fun main() {
    val bintang: Bintangku = PiramidaBintang(8)
    bintang.cetak()
}