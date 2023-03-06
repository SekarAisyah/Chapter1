package SOLID

//TANPA SRP
//fun main(){
//    class buku {
//        fun Cari() {
//            // pencarian buku berdasarkan query
//        }

//       fun peminjaman() {
//            // proses peminjaman buku oleh anggota perpustakaan
//        }

//       fun pengembalianBuku() {
            // proses pengembalian buku oleh anggota perpustakaan
//        }
//    }
//}

fun main (){
    class Book {
        // properties dan method untuk merepresentasikan buku
    }

    class PencarianBuku {
        fun search(){
            // pencarian buku berdasarkan query
        }
    }

    class TransaksiPeminjamanBuku {
        fun pinjamBuku() {
            // proses peminjaman buku oleh anggota perpustakaan
        }

        fun pengembalianBuku() {
            // proses pengembalian buku oleh anggota perpustakaan
        }
    }
}