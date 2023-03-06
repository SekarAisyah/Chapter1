package ChallengeChapter1

fun main() {
    val baris = 8
    var k = 0

    for (i in baris downTo 1) {

        for (space in 1..baris-i) {
            print("  ")
        }

        while (k != 2*i-1) {
            print("* ")
            ++k
        }
        k = 0

        println()
    }
}
