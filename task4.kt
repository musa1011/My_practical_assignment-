fun main() {
    // Print numbers from 1 to 10
    println("Numbers from 1 to 10:")
    for (i in 1..10) {
        print("$i ")
    }

    // Print a new line for separation
    println("\n")

    println("Even numbers from 1 to 20:")
    (1..20).filter { it % 2 == 0 }
}

