package ControlFlow

fun main() {
    var i = 2
    while (i <= 20) {
        println(i)
        i += 2
    }

    var angka = 1
    var count = 0
    while (angka <= 50) {
        if (angka % 2 != 0) {
            count++
        }
        angka++
    }
    println("Jumlah bilangan ganjil antara 1 dan 50 adalah $count")
}

