package StukturData_01

fun main() {
    val nama: String = "John Doe"
    println("Nama : $nama")

    val umur: Int = 25
    println("Umur: $umur")

    val gaji: Double = 5000.0
    println("Gaji: $gaji")

    val status: Boolean = true
    println("Status: $status")

    val nilai: Float = 7.5f
    println("Nilai: $nilai")

    val angka1: Long = 123456789L
    println("Angka1: $angka1")

    val angka2: Short = 100
    println("Angka2: $angka2")

    val huruf: Char = 'A'
    println("Huruf: $huruf")

    val nilaiString: String = "10"
    println("NilaiString: $nilaiString")

    val angka3: Byte = 25
    println("Angka3: $angka3")

    // Deklarasi array
    val angka = intArrayOf(1, 2, 3, 4, 5)
    for (angkaku in angka) {
        println("Angka di Array $angkaku")
    }

    val hurufArray = charArrayOf('a', 'b', 'c', 'd', 'e')
    for (hurufPadaArray in hurufArray) {
        println("Huruf pada Array: $hurufPadaArray")
    }
    val nilaiArray = doubleArrayOf(3.5, 4.0, 2.5, 3.0)
    for (nilaiDoublePadaArray in nilaiArray) {
        println("nilai : $nilaiDoublePadaArray")
    }

    val namaArray = arrayOf("John", "Doe", "Jane", "Doe")
    for (namaPadaArray in namaArray) {
        println("Nama : $namaPadaArray")
    }

    val bulan = Array(12) { i ->
        when (i) {
            0 -> "Januari"
            1 -> "Februari"
            2 -> "Maret"
            3 -> "April"
            4 -> "Mei"
            5 -> "Juni"
            6 -> "Juli"
            7 -> "Agustus"
            8 -> "September"
            9 -> "Oktober"
            10 -> "November"
            else -> "Desember"
        }
    }
    //Cetak Bulan
    for (mybulan in bulan) {
        println("Bulan $mybulan")
    }

    val nilaiFloat = floatArrayOf(2.5f, 3.0f, 2.0f)
    for (nilai in nilaiFloat) {
        println(nilai)
    }

    // Deklarasi list
    val angkaList1 = listOf(1, 2, 3, 4, 5)
    println("Angka Pada List: $angkaList1")

    val hurufList1 = listOf('a', 'b', 'c', 'd', 'e')
    println("Huruf pada List: $hurufList1")

    val nilaiList = listOf(3.5, 4.0, 2.5, 3.0)
    println("Nilai pada List: $nilaiList")

    val namaList = listOf("John", "Doe", "Jane", "Doe")
    println("Nama pada List: $namaList")

    val bulanList = listOf(
        "Januari",
        "Februari",
        "Maret",
        "April",
        "Mei",
        "Juni",
        "Juli",
        "Agustus",
        "September",
        "Oktober",
        "November",
        "Desember"
    )
    println("Bulan pada List: $bulanList")

    val nilaiFloatList = listOf(2.5f, 3.0f, 2.0f)
    println("Nilai Float pada List: $nilaiFloatList")

    // Mengubah nilai pada indeks tertentu dalam list angka menjadi nilai 10
    val angkaList = mutableListOf(1, 2, 3, 4, 5) //Gunakan mutable agar data dapat di Crud
    angkaList[2] = 10

    // Mengubah nilai pada indeks tertentu dalam list huruf menjadi nilai 'f'
    val hurufList = mutableListOf('a', 'b', 'c', 'd', 'e') //Gunakan mutable agar data dapat di Crud
    hurufList[3] = 'f'
    println("Huruf pada List: $hurufList")

    // Menambahkan nilai baru ke dalam list nilai
    val nilaiBaruList = mutableListOf(3.5, 4.0, 2.5, 3.0) //Gunakan mutable agar data dapat di Crud
    nilaiBaruList.add(3.8)
    println(nilaiBaruList)


    // Menghapus nilai pada indeks tertentu dalam list nama
    val namaRemovelist = mutableListOf("John", "Doe", "Jane", "Doe")
    namaRemovelist.removeAt(1) //Gunakan mutable agar data dapat di Crud
    println(namaRemovelist)

    // Menyalin nilai dari list bulan ke list bulanBaru dan menambahkan nilai 'Januari' ke list bulanBaru
    val bulanBaru = bulanList.toMutableList() //Gunakan mutable agar data dapat di Crud
    bulanBaru += "Januari" // bulanBaru = ["Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember", "Januari"]
}

