class Car(
    val brand: String = "Unknown",
    val model: String = "Unknown",
    val year: Int = 2000
) {
    fun displayDetails() {
        println("$brand $model ($year)")
    }
}

fun main() {
    val defaultCar = Car()
    val myCar = Car("Honda", "Civic", 2021)

    defaultCar.displayDetails()  // Prints: Unknown Unknown (2000)
    myCar.displayDetails()       // Prints: Honda Civic (2021)
}