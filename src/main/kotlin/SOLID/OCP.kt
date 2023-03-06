package SOLID

//Open/Closed Principle (OCP) adalah prinsip desain yang menyatakan bahwa sebuah kelas open for extension
// tetapi closed for modification.
abstract class Shape {
    abstract fun Luas(): Double
}

class Persegi(private val width: Double, private val height: Double) : Shape() {
    override fun Luas() = width * height
}

class Lingkaran(private val radius: Double) : Shape() {
    override fun Luas() = 3.14 * radius * radius
}


//Dengan menggunakan Abstrack Shape, kita dapat menambahkan bentuk baru dengan
// mudah tanpa perlu mengubah kode di kelas AreaCalculator.
// Kita hanya perlu membuat kelas baru yang mengimplementasikan interface Shape dan menghitung luas dari bentuk tersebut.
// Sehingga, kelas AreaCalculator tetap tertutup untuk modifikasi dan terbuka untuk perluasan.

