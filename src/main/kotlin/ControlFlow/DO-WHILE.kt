package ControlFlow

fun main() {
    var i = 1
    do {
        if (i % 2 != 0) {
            println(i)
        }
        i++
    } while (i <= 20)
    //Pertama, kita menginisialisasi variabel i dengan nilai 1, karena bilangan ganjil selalu dimulai dari angka 1.
    //Selanjutnya, kita menggunakan perulangan do-while untuk mencetak bilangan ganjil antara 1 dan 20. Kondisi perulangan adalah i <= 20, yang berarti perulangan akan berjalan selama nilai dari variabel i tidak melebihi 20.
    //Pada setiap iterasi perulangan, kita menggunakan if (i % 2 != 0) untuk memeriksa apakah nilai dari variabel i ganjil atau tidak. Jika ganjil, kita mencetak nilai variabel i menggunakan println().
    //Setelah selesai melakukan perulangan, program akan berhenti.


    //Buatlah program Kotlin yang akan meminta pengguna untuk memasukkan sebuah bilangan bulat positif
    // dan kemudian menampilkan semua bilangan bulat positif yang lebih kecil dari bilangan tersebut
    // menggunakan perulangan do-while!
    print("Masukkan sebuah bilangan bulat positif: ")
    val number = readLine()?.toIntOrNull()

    if (number != null && number > 0) {
        var i = 1
        do {
            println(i)
            i++
        } while (i < number)
    } else {
        println("Input tidak valid, silakan masukkan bilangan bulat positif!")
    }

    //Pertama, program akan meminta pengguna untuk memasukkan sebuah bilangan bulat positif menggunakan print() dan readLine().
    //Selanjutnya, kita menggunakan toIntOrNull() untuk mengubah nilai input pengguna menjadi tipe data integer. Jika input tidak dapat diubah menjadi integer, nilai variabel number akan menjadi null.
    //Setelah itu, kita menggunakan if untuk memeriksa apakah nilai dari variabel number bukan null dan lebih besar dari 0. Jika ya, kita melanjutkan eksekusi program. Jika tidak, program akan mencetak pesan kesalahan.
    //Pada bagian yang melanjutkan eksekusi program, kita menginisialisasi variabel i dengan nilai 1. Kemudian, kita menggunakan perulangan do-while untuk mencetak semua bilangan bulat positif yang lebih kecil dari number. Kondisi perulangan adalah i < number, sehingga perulangan akan berjalan selama nilai dari variabel i lebih kecil dari number.
    //Pada setiap iterasi perulangan, kita mencetak nilai variabel i menggunakan println(), kemudian menambahkan nilai variabel i dengan 1 menggunakan operator ++. Hal ini dilakukan agar nilai i selalu bertambah 1 pada setiap iterasi, sehingga kita mencetak semua bilangan bulat positif yang lebih kecil dari number.
}