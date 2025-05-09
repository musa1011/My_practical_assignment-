fun main() {
    // Ask for user's name
    print("Please enter your name: ")
    val name = readlnOrNull() ?: "Unknown"

    // Ask for user's age
    print("Please enter your age: ")
    val age = readlnOrNull()?.toIntOrNull() ?: 0

    // Print greeting message
    println("Hello $name, you are $age years old!")
}