package ControlFlow

fun main() {
    //Menentukan hari sekarang
    val dayOfWeek = 3 // angka hari, dimana 1 = Senin, 2 = Selasa, dan seterusnya

    val day = when (dayOfWeek) {
        1 -> "Senin"
        2 -> "Selasa"
        3 -> "Rabu"
        4 -> "Kamis"
        5 -> "Jumat"
        6 -> "Sabtu"
        7 -> "Minggu"
        else -> "Invalid day" // jika angka tidak valid
    }

    println("Sekarang Hari: $day")

    //Menentukan apakah sebuah bilangan bulat positif, negatif, atau nol. Gunakan when expression
    val bilangan = -5
    when {
        bilangan > 0 -> println("$bilangan adalah bilangan positif")
        bilangan < 0 -> println("$bilangan adalah bilangan negatif")
        else -> println("$bilangan adalah nol")
    }


}


