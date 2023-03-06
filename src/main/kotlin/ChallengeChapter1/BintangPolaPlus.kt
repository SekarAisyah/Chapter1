package ChallengeChapter1

//Menerapkan OOP dan Solid
interface BintangP {
    fun cetak()
}

class BintangPlus(private val size: Int) : BintangP {
    private val tengah = size / 2

    override fun cetak() {
        for (i in 0 until size) {
            for (j in 0 until size) {
                if (i == tengah || j == tengah) {
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
    val bintang: BintangP = BintangPlus(11)
    bintang.cetak()
}
