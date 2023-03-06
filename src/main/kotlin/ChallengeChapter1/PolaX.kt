package ChallengeChapter1

// Menerapkan OOP dan SOLID
interface Bintang {
    fun cetak()
}

class BintangHurufX(private val size: Int) : Bintang {
    override fun cetak() {
        for (i in 0 until size) {
            for (j in 0 until size) {
                if (i == j || i + j == size - 1) {
                    print("* ")
                } else {
                    print("  ")
                }
            }
            println()
        }
    }
}

fun main() {
    val bintangHurufX = BintangHurufX(10)
    bintangHurufX.cetak()
}
