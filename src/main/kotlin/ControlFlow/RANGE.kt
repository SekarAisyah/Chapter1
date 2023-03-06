package ControlFlow

fun main() {
    //Menampilkan semua bilangan bulat dari 1 hingga 10
    // i in 1..10 artinya nilai i dalam range 1 sampai 10 => closed range
    for (i in 1..10) {
        println(i)
    }

    //Jika ingin menggunakan HalfOpenRange dan tidak mencakup nilai 10, maka dapat mengganti operator .. dengan operator until seperti ini:
    for (i in 1 until 10) {
        println(i)
    }

    //Mencetak bilangan genap 0 sampai dengan 20
    //step 2 = untuk parameter bilangan genap
    for (i in 0..20 step 2) {
        println(i)
    }

    //mencetak huruf A sampai Z
    for (char in 'A' .. 'Z') {
        println(char)
    }

    //Menampilkan semua angka dari 10 hingga 1 secara terbalik
    //Gunakan doen to untk mencetak nilai 10 hinga 1
    for (i in 10 downTo 1) {
        println(i)
    }

    var sum = 0
    for (i in 1..100 step 2) {
        sum += i
    }
    println("Jumlah bilangan ganjil dari 1 sampai 100 adlalh : $sum")
}