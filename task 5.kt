// Function that returns the sum of two integers
fun sum(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    // Test cases with different values
    println("5 + 3 = ${sum(5, 3)}")
    println("10 + 20 = ${sum(10, 20)}")
    println("-5 + 8 = ${sum(-5, 8)}")
    println("0 + 0 = ${sum(0, 0)}")
    println("100 + (-50) = ${sum(100,-50)}")
}