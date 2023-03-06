package ControlFlow

fun main() {
    fun isOdd(number: Int): Boolean {
        //Jika hasil bagi tidak sama dengan 0, maka number dianggap ganjil dan fungsi akan mengembalikan true.
        if (number % 2 != 0) { //
            return true
        } else {
            return false
        }
    }

    println(isOdd(5)) // akan menampilkan true
    println(isOdd(6)) // akan menampilkan false

    //Buatlah sebuah fungsi dengan nama getDiscount yang menerima dua parameter bertipe data Double, yaitu price dan discount.
    // Jika harga lebih besar dari 100 dan diskon lebih besar dari 10, maka fungsi akan mengembalikan harga setelah diskon.
    // Jika kondisi tersebut tidak terpenuhi, maka fungsi akan mengembalikan harga asli.
    fun getDiscount(price: Double, discount: Double): Double {
        if (price > 100 && discount > 10) {
            return price * (1 - (discount / 100))
        } else {
            return price
        }

    }

    println(getDiscount(120.0, 15.0)) // akan menampilkan 102.0
    println(getDiscount(80.0, 20.0)) // akan menampilkan 80.0

    //Buatlah sebuah fungsi dengan nama calculateGrade yang menerima satu parameter bertipe data Int
    // yang merupakan nilai mahasiswa dalam skala 0-100. Fungsi akan mengembalikan nilai huruf berdasarkan skala nilai berikut:
    //A: 90-100
    //B: 80-89
    //C: 70-79
    //D: 60-69
    //F: kurang dari 60
    fun calculateGrade(score: Int): String {
        if (score >= 90 && score <= 100) {
            return "A"
        } else if (score >= 80 && score <= 89) {
            return "B"
        } else if (score >= 70 && score <= 79) {
            return "C"
        } else if (score >= 60 && score <= 69) {
            return "D"
        } else {
            return "F"
        }
    }
    println(calculateGrade(80)) // akan menampilkan B
    println(calculateGrade(70)) // akan menampilkan C
    println(calculateGrade(60)) // akan menampilkan D


}

