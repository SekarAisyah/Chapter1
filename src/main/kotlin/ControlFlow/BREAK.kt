package ControlFlow

fun main() {
    //Buatlah program Kotlin yang akan menghitung jumlah bilangan ganjil antara 1 hingga 50
    //menggunakan perulangan for, dan menggunakan expression break untuk menghentikan perulangan
    //ketika bilangan yang diperiksa lebih besar dari 25
    val arr = intArrayOf(5, 3, 7, 9, 6, 2)
    var bilangan: Int? = null

    for (i in arr) {
        if (i % 3 == 0) {
            bilangan = i
            break
        }
    }
    var jumlahGanjil = 0

    for (i in 1..50) {
        if (i > 25) {
            break
        }

        if (i % 2 != 0) {
            jumlahGanjil++
        }
    }
    println("Jumlah bilangan ganjil antara 1 dan 25 adalah $jumlahGanjil")

    //Buatlah program Kotlin yang akan mencari nilai pertama dari
    // sebuah array yang habis dibagi 3 (intArrayOf(5, 3, 7, 9, 6, 2)) menggunakan perulangan dan penggunaan break
    if (bilangan != null) {
        println("Bilangan pertama dalam array yang habis dibagi 3 adalah $bilangan")
    } else {
        println("Tidak ada bilangan dalam array yang habis dibagi 3")
    }

}
