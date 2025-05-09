fun main() {
    // Lambda expression that multiplies two integers
    val multiply = { a: Int, b: Int -> a * b }

    // Test cases
    println("5 × 3 = ${multiply(5, 3)}")
    println("10 × 20 = ${multiply(10, 20)}")
    println("-4 × 8 = ${multiply(-4, 8)}")
   // println("0 × 100 = ${multiply(0, 100)}")
}