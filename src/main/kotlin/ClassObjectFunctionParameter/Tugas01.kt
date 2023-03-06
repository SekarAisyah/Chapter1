package ClassObjectFunctionParameter

fun main() {
    println("\n===INPUT TRANSAKSI PENJUALAN TOKO BUKU AND5===")
    // input data transaksi
    print("NAMA PEMBELI : ")
    val nama = readLine() ?: ""
    print("JUDUL BUKU : ")
    val judulBuku = readLine() ?: ""
    print("JUMLAH : ")
    val jumlahBuku = readLine()?.toIntOrNull() ?: 0
    print("HARGA : ")
    val hargaBuku = readLine()?.toIntOrNull() ?: 0
    print("UANG BAYAR : ")
    val uangBayar = readLine()?.toIntOrNull() ?: 0

    // hitung total belanja
    val totalBelanja = jumlahBuku * hargaBuku

    // hitung bonus dan diskon
    var bonus = ""
    var diskon = 0
    when {
        totalBelanja in 150001..200000 -> {
            bonus = "1 BUAH PENA KECIL"
        }
        totalBelanja in 200001..300000 -> {
            bonus = "1 BUAH BUKU CATATAN"
        }
        totalBelanja > 300000 -> {
            diskon = 50000
        }
    }

    // hitung total pembayaran
    val totalPembayaran = totalBelanja - diskon

    // output hasil transaksi
    println("\n===STRUK PEMBELIAN TOKO BUKU AND5===")
    println("NAMA PEMBELI : $nama")
    println("JUDUL BUKU : $judulBuku")
    println("JUMLAH : $jumlahBuku")
    println("HARGA : $hargaBuku")
    println("TOTAL BELANJA : $totalBelanja")
    if (bonus.isNotEmpty()) {
        println("BONUS : $bonus")
    }
    if (diskon > 0) {
        println("DISKON PEMBELIAN : $diskon")
    }
    println("TOTAL PEMBAYARAN : $totalPembayaran")
    if (totalPembayaran > uangBayar) {
        val kurang = totalPembayaran - uangBayar
        println("UANG KEMBALIAN : ${uangBayar - totalPembayaran}")
        println("UANG KURANG : $kurang")
    } else {
        println("UANG KEMBALIAN : ${uangBayar - totalPembayaran}")
    }
}
