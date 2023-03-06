package ControlFlow

fun main() {
    val rows = 5
    for (i in 1..rows) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
    //Definiskan jumlah baris segitiga bintang yang ingin dicetak dengan variabel rows.
    //Kemudian, kita menggunakan dua buah loop for untuk mencetak segitiga bintang. Loop pertama untuk mengatur jumlah baris, dan loop kedua untuk mencetak bintang pada setiap baris.
    //Pada loop kedua, kita menggunakan print("*") untuk mencetak bintang pada setiap kolom pada baris yang sedang diproses.
    //Setelah loop kedua selesai dijalankan untuk setiap baris, kita menggunakan println() untuk memindahkan kursor ke baris selanjutnya, sehingga bintang-bintang pada baris berikutnya dicetak pada baris yang baru.

    val baris = 5
    var k = 0
    for (i in 1..baris) {
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

    //Definisikan jumlah baris segitiga piramida bintang yang ingin dicetak dengan variabel baris.
    //Selanjutnya, kita menggunakan dua buah loop for untuk mengatur jumlah baris dan kolom pada segitiga piramida.
    //Loop pertama untuk mengatur jumlah baris, sedangkan loop kedua untuk mengatur jumlah spasi dan bintang pada setiap baris.
    //Pada loop kedua, kita menggunakan for (space in 1..baris-i) untuk mencetak spasi pada setiap kolom pada baris yang sedang diproses. Jumlah spasi yang dicetak bergantung pada nilai dari variabel i.
    //Setelah spasi-spasi dicetak, kita menggunakan loop while untuk mencetak bintang-bintang pada setiap kolom pada baris yang sedang diproses. Kondisi loop while adalah k != 2*i-1, yang berarti loop akan berjalan selama k belum mencapai jumlah bintang yang harus dicetak pada baris tersebut. Variabel k digunakan untuk menghitung jumlah bintang yang sudah dicetak.
    //Setelah loop while selesai dijalankan untuk setiap baris, kita mengembalikan nilai k ke 0, dan menggunakan println() untuk memindahkan kursor ke baris selanjutnya, sehingga baris berikutnya akan dicetak pada baris yang baru.
}