fun main() {
    // Task 3: Check if a number is even or odd
    print("Enter a number: ")
    val number = readlnOrNull()?.toIntOrNull() ?: 0

    if (number % 2 == 0) {
        println("$number is an even number.")
    } else {
        println("$number is an odd number.")
    }
}
